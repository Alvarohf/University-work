def numeroEnLetra(numero):
    """int --> str
    OBJ: devuelve un número introducido en letra
    PRE: 30<=numero<=99 """
    decenas=("treinta","cuarenta","cincuenta","sesenta","setenta","ochenta","noventa")
    unidades=("","y uno","y dos","y tres","y cuatro","y cinco","y seis","y siete","y ocho","y nueve")
    return decenas[numero//10 -3]+' '+unidades[numero%10]
'''#Probador captura el argumento 'numero'
numero=int(input("Numero:"))
print(numeroEnLetra(numero))'''
