def comparador_3numeros(a,b,c):
    """int,int,int-->int,int,int
    OBJ:comparar los números introducidos"""
    if a>b and b>c: print (a,'>',b,'>',c)
    elif a>b and c>b: print (a,'>',c,'>',b)
    elif a<b and a>c: print (b,'>',a,'>',c)
    elif c<b and a<c: print (b,'>',c,'>',a)
    elif c>a and a>b: print (c,'>',a,'>',b)
    else: print(c,'>',b,'>',a)
a=int(input('Escriba cualquier número'))
b=int(input('Escriba cualquier número'))
c=int(input('Escriba cualquier número'))
print(comparador_3numeros(a,b,c))
