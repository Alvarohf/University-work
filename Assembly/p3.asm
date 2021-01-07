dosseg
.model small
.stack 100h
.data
	Text1 DB "String 1: $"
	Text2 DB "String 2: $"
	Text3 DB "The text contains the following number of different chars: $"
	;We fill the vectors with null ascii chars
	vec1 DB 120 dup (0), '$'
	vec2 DB 120 dup (0), '$'
	Maximum EQU 120
	OtherLine DB 13,10,'$'  
	dif DW ?
	strOutput db 16 dup (0)


.code
;Macro to compare each char
compare macro str1, str2
	Local Repeat
	xor si,si
	mov cl, Maximum
	Repeat:
		mov al,[str1+si]
		mov bl,[str2+si]
		cmp al,bl
		je skip
		inc dif
		skip:
		inc si
	LOOP Repeat
		
endm

;Macro to pass an integer to string
intToString macro integer

	mov ax, integer
	;We will divide between 10 (decimal)
	mov cx, 10
	xor bx, bx 

	divide:
	xor dx, dx
	div cx
	;We save the result in the stack
	push dx 
	;Count it
	inc bx 
	;Test if ax is not zero
	test ax, ax
	jnz divide 

	;Now pop them using our count in bx
	mov cx, bx
	lea si, strOutput
	;Get each digit in ascii
	get_digit:
	pop ax
	add al, '0' 
	;Save it in the buffer
	mov [si], al
	inc si

	loop get_digit

	; We pass them to string format
	mov al, '$'
	mov [si], al
	lea dx, strOutput
	;We show it in screen
	mov ah, 9
	int 21h
	endm

Inicio:
	mov ax, @data
	mov ds, ax
	
	;Show Text1
	mov ah,9
	lea dx,Text1
	int 21h

	;Fills vec1 with chars introduced
	mov cl, Maximum
	xor si,si
	loop1:
		mov ah, 01h ;Aks for a char
		int 21h
		cmp al, 0dh ;Until char is enter	
		je exit
		mov [vec1+si], al ;Saves char in the char array
		inc si
		loop loop1  
	exit:
	mov [vec1+Maximum],24h
	;Clean ax
	xor ax, ax
	
	mov ah, 9
    lea dx, OtherLine
    int 21h
	
	;Show Text2
	mov ah, 9
	lea dx,Text2
	int 21h
	
	;Fills vec2 with chars introduced
	mov cl, Maximum
	xor si,si
	loop2:
		mov ah, 01h ;Aks for a char
		int 21h
		cmp al, 0dh ;Until char is enter
		je exit2
		mov [vec2+si], al ;Saves char in the char array
		inc si
		loop loop2
	exit2:
	mov [vec2+Maximum],24h
	
	compare vec1, vec2
	
	;Clean dx
	xor dx, dx
	
	;Show Text3
	mov ah, 9
	lea dx, Text3
	int 21h
	
	;Clean dx
	xor dx, dx
	
	;Conver integer to string and echo it
	
	intToString dif
	
	;Add a new empty line to get better appearence
	mov ah, 9
    lea dx, OtherLine
    int 21h
	;Let us check the result in command line
	mov ah, 01h 
	int 21h
	;End and return al value
	mov ah, 4Ch
	int 21h

END Inicio