DOSSEG
.MODEL SMALL
.STACK 100h
.DATA
Usuarios DB "ANTONIO GOMEZ GOMEZ%A23$"
DB "LUISA ALONSO LOPEZ%A1SA3$"
DB "FERNANDO PEREZ MINGUEZ%2W45$"
DB "JOSEFA RUIZ SANCHEZ%ASQ12$"
DB "MIGUEL GARCIA GARCIA%S1A$"
LonUsua EQU $-Usuarios                                                  ;10
LonParc DB 5 DUP() ;Permite indexar la tabla de
;usuarios guardando la longitud
;de cada entrada
Mensaje1 DB "Nombre de usuari@: $"
Mensaje2 DB "Por favor, introduzca su clave de acceso: $"
Mensaje3 DB "Bienvenid@ al sistema.$"
Mensaje4 DB "Nombre de usuari@ o palabra clave incorrectos.$"
Mensaje5 DB "Ha sobrepasado el numero de intentos de entrada."
DB "El sistema se bloquea.",10,13,"$"
BufUsu DB 31 ;Buffer para guardar el usuario                              ;20
LonUsu DB 0
Usuari DB 31 DUP (?)
LonCla DW 0 ;Buffer to store password
Clave DB 5 DUP (?)
NumInt DB 0 ;Number of failed atempts

.CODE


;Macro to change video mode                                                ;30
ModoVideo MACRO modo                                                      
	mov ah,0
	mov al,modo
	int 10h
ENDM


;Macro to change cursor position
;PonCursor MACRO fil,col
;mov ah,2
;xor bx,bx                                                                    ;40
;mov dh,BYTE PTR fil
;mov dl,BYTE PTR col
;int 10h
;ENDM

PonCursor PROC
	push bp
	mov bp,sp
	push dx                                ;50
	push ax
	mov ah, 2
	mov dx,[bp+4]
	int 10h
	pop ax
	pop dx
	pop bp
	RET 2
PonCursor ENDP
                                        ;60


;Procedure to display a string on the screen
;SacaMens PROC
;push bp
;mov bp,sp
;push dx
;push ax
;mov ah,9
;mov dx,[bp+4]
;int 21h                                        ;70
;pop ax
;pop dx
;pop bp
;RET 2
;SacaMens ENDP
SacaMens MACRO addr
	mov ah,9
	lea dx,addr
	int 21h                                        ;80
ENDM




Inicio:
 
mov ax,@DATA
mov ds,ax
                                                                          
;Ask for username and password
	otrave: ModoVideo 3                                ;90
		mov dh, 10
		mov dl, 15
		push dx
		call PonCursor
	;PonCursor 10,15


		SacaMens Mensaje1
		lea dx, BufUsu
		mov ah,0Ah
		int 21h                                                ;100


		mov dh, 12
		mov dl, 15
		push dx
		call PonCursor
		;PonCursor 12,15


		SacaMens Mensaje2
		lea bx, Clave     ;reading passwor
		xor si,si                                        ;110
		lazo1: mov ah,8
			int 21h
			mov [bx+si],al
			cmp al,13
			je salir
			mov ah,0Eh
			mov al,'*'
			int 10h
			inc si
			cmp si,5                                        ;120
		jbe lazo1
		
		salir: mov LonCla,si   ;password length stored
		;Indexar tabla de usuarios
		xor si,si
		xor di,di
		mov dl,1 ;each user type is taken into account to calculate length
		lea bx, Usuarios
		mov cx,LonUsua
		mov al,'$'
		
		lazo2: cmp al,[bx+si]                                ;130
			jne seguir
			mov LonParc[di],dl
			xor dl,dl
			inc di
			seguir: inc si
			inc dl
		loop lazo2
		
		;Check username with allowed stored names
		lea bx, Usuarios
		xor di,di
		xor si,si
		xor cx,cx
		mov cl,LonParc     ;First entry length
		otrous: xor si,si
			lazo3: mov al,Usuari[si]
				cmp al,20h ;If space conversion is not required
				je saltar
				and al,11011111b ;Username uppercase conversion
				saltar: cmp al,[bx+si]
				jne salfin
				inc si
			loop lazo3
			
		salfin: cmp BYTE PTR[bx+si],'%'
		
			je nomcorr
			mov cl,LonParc[di]
			add bx,cx
			inc di
		cmp bx,LonUsua ;Ends
		jb otrous
		
		jmp nominc
		
		;Correct name, then password chacking
		nomcorr:
		xor cx,cx
		mov cl,LonParc[di] ;Password length
		sub cx,si ;(LonParc[di]-si)-2
		dec cx
		dec cx
		
		cmp cx,LonCla ;password too long
		jb nominc ;despite of first character matching
		inc si
		xor di,di
		
		lazo4: mov al,Clave[di]
			cmp al,[bx+si]
			jne nominc
			inc si
			inc di
		loop lazo4
		
		;Display welcome message
		mov dh, 14
		mov dl, 15
		push dx
		call PonCursor
		;PonCursor 14,15

		SacaMens Mensaje3
		jmp final
		
		;Display Username or password incorrect. Block access
		nominc:
		mov dh, 14
		mov dl, 15
		push dx
		call PonCursor
		;PonCursor 14,15


		SacaMens Mensaje4
			mov al,NumInt
			inc al
			cmp al,3
			jae bloquea
			mov NumInt,al
			
	jmp otrave
	bloquea:
		mov dh, 16
		mov dl, 4
		push dx
		call PonCursor
	;PonCursor 16,4


	SacaMens Mensaje5
		jmp bloquea
			final: mov ah,4Ch
			int 21h
			END Inicio
			caMens
		jmp bloquea

		final: 
		mov ah,4Ch
		int 21h
END Inicio