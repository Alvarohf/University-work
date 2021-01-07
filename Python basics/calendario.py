"""********************************************************
 *               OBJ: SABER EL MES DADO                   *                              
 *                  ALVARO DE LAS HERAS                   *
 *******************************************************"""
def saber_mes(mes):
    """int-->str
    OBJ:Saber el mes dado
    PRE: 1=<mes=<12"""
    print('\t\tMES EN LETRA','\n','\t\t=============')#Interfaz de usuario
    if mes==1: print('Enero es el mes dado')
    elif mes==2:print('Febrero es el mes dado')
    elif mes==3:print('Marzo es el mes dado')
    elif mes==4:print('Mayo es el mes dado')
    elif mes==5:print('Abril es el mes dado')
    elif mes==6:print('Junio es el mes dado')
    elif mes==7:print('Julio es el mes dado')
    elif mes==8:print('Agosto es el mes dado')
    elif mes==9:print('Septiembre es el mes dado')
    elif mes==10:print('Octubre es el mes dado')
    elif mes==11:print('Noviembre es el mes dado')
    elif mes==12:print('Diciembre es el mes dado')
    else: print('Valor no válido')
mes=int(input('Introduzca mes: '))
saber_mes(mes)
'''#Probador
mes=1
mes=12'''
