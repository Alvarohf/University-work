#Calculo de notas con redondeo a 0.5
def calculo_notas(nota):
    """float-->float
    OBJ:Calcular la nota redondeando a 0.5
    PRE: 10<=nota>=0"""
    nota_final=round(2*nota)/2
    return nota_final
nota=float(input('Ingrese la nota'))
print(calculo_notas(nota))
