Unidad=["", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"]
Decena=["", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"]
Centena=["", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"]
Millar=["", "M", "MM"]
def num_Romano (Unidad,Decena,Centena,Millar,num_Arabigo):
    """int,list,list,list,list---> none
    OBJ: numero en romano a partir del numero del usuario
    PRE: 0<numero<2000"""
    u=num_Arabigo%10
    d=int(num_Arabigo/10)%10
    c=int(num_Arabigo/100)%10
    m=int(num_Arabigo/1000)
    print(Millar[m]+Centena[c]+Decena[d]+Unidad[u]) 
try:
    num_Arabigo=int(input('Ingrese número: '))
    if (num_Arabigo>=0 and num_Arabigo<=2000):
        num_Romano (Unidad,Decena,Centena,Millar,num_Arabigo)
    else:
        print('Fuera del rango establecido')
except:
    print('Valor no válido')
