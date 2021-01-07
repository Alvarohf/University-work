def comparador_3numeros(a,b,c):
    """int,int,int-->int,int,int
    OBJ:comparar los números introducidos"""
    if a>b and b>c: sol=str(a > b > c)
    elif a>b and c>b: sol=str(a > c > b)
    elif a<b and a>c: sol=str(b > a > c)
    elif c<b and a<c: sol=str(b > c > a)
    elif c>a and a>b: sol=str(c > a > b)
    else: sol=str(c > b > a)
    return sol
a=int(input('Escriba cualquier número'))
b=int(input('Escriba cualquier número'))
c=int(input('Escriba cualquier número'))
print(comparador_3numeros(a,b,c))
