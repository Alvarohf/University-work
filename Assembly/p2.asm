dosseg
.model small                                                                        
.stack 100h 
.data
    Texto DB  "Please, enter a hexadecimal number of four digits between 0 and F  $"
    varc2 DW 0000h
    varex DW 0000h
.code
Inicio:
    mov ax, @data
    mov ds, ax

    ;Echo the text message
    mov ah, 9
    lea dx, Texto 
    int 21h

    ;Clean bh and waits for pressed key
    xor bh, bh
    mov ah, 1
    int 21h

    ;Substract 30h or 37h(Ascii value)
    mov cl, 4
    mov bh, al
    cmp bh,39h
    jbe skip
    sub bh,7h
    skip:
    sub bh, 30h

    ;Shifts the value to left 4 bits
    shl bh, cl 

    ;Substract 30h or 37h(Ascii value)
    int 21h
    cmp al,39h
    jbe skip2
    sub al,7h
    skip2:
    sub al,30h
    add bh, al
	
    ;Clean bl and waits for pressed key
    xor bl, bl
    int 21h
	
    ;Substract 30h or 37h(Ascii value)
    mov bl, al
    cmp bl,39h
    jbe skip3
    sub bl,7h
    skip3:
    sub bl, 30h

    ;Shifts the value to left 4 bits
    shl bl, cl 
 
    ;Substract 30h or 37h(Ascii value)
    int 21h
    cmp al,39h
    jbe skip4
    sub al,7h
    skip4:
    sub al, 30h
    add bl, al

    ;Invert in c2 the value introduced
    neg bx
    mov varc2, bx

    ;Invert in excess 16-1 the value introduced
    mov varex, bx
    add varex, 8000h
	
    ;Return value of variable
    mov ah, 4Ch
    int 21h
END Inicio 