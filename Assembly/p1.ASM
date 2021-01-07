Dosseg
.model small
.stack 100h
.data
    	Operando1 DB 10h
    	Operando2 DB 20h
	ResSuma DW 0000h
	ResResta DW 0010h
	ResMul DW 0020h
	ResDiv DW 0030h
.code 
Inicio:
	mov ax,@data
    	mov ds, ax 
	
	sub ax, ax
	
	mov al, Operando1
   	add al, Operando2 ;Adds Operand1 and Operand2
    	mov ResSuma, ax ;Saves sum result
	
	mov al, Operando2
   	sub al, Operando1 ;Substract Operand1 and Operand2
    	mov ResResta, ax ;Saves substract result
	
	sub ax, ax
	mov al, Operando1
    	mov bl, Operando2
    	mul bl;Multiply Operand1 and Operand2
    	mov ResMul, ax  ;Saves multiplication result
	
	sub ax, ax
    	sub bx, bx
	mov al, Operando2
    	mov bl, Operando1
    	div bl ;Divides Operand1 and Operand2
	mov ResDiv, ax ;Saves division result
	
	mov ah, 4Ch
    	int 21h ; Interruption that exit and return value
end Inicio 
