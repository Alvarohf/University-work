a=float(input('Valor de a= '))

b=float(input('Valor de b= '))

c=float(input('Valor de c= '))

radicando=(b**2)-(4*a*c)

if radicando<0: print("No tiene solución real")

elif a!=0: sol1=((-b)+sqrt(radicando))/(2*a); sol2=((-b)-sqrt(radicando))/(2*a); print("Las soluciones son: ",sol1,"y",sol2)

elif b!=0 :print("Tiene una unica solucion",-c/b)#a=0 b!=0 y c=0 o c!=0

elif c==0: print("Tiene infinitas soluciones") # a=0,b=0 y c=0

else: print("No tiene solución")
