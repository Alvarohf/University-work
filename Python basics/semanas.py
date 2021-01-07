from calendar import monthrange
def pintar_semanas(mes,anno):
    """int,int-->int,int...
    OBJ:Pintar las 4 primeras semanas de un mes dado
    PRE: año>=1582 1<=mes=<12"""
    a=monthrange(anno,mes)
    print('\t\tMeses del año')
    print('\t\t=============',)
    print('   ',end='')
    print('LU','MA','MI','JU','VI','SA','DO',sep='   ')
    print(a[0]*'     ',end='') 
    for dias in range(1,29,1):
        if dias+a[0]==8:print('\n')
        elif dias+a[0]==15:print('\n')
        elif dias+a[0]==22:print('\n')
        elif dias+a[0]==29:print('\n')
        print('%5d'%dias,end='')
    print('\n')
try:
    mes=int(input('Introduzca mes: '))
except ValueError:
    print('El mes debe de ser un entero entre 1 y 12')
    exit()
try:
    anno=int(input('Introduzca año: '))
except ValueError:
    print('El año debe de ser mayor a 1582')
    exit()
    if 1 < mes > 12:
        print('El mes debe de ser un entero entre 1 y 12')
else:
    if anno < 1582:
        print('El año debe ser un entero mayor que 1582')
    else:
        pintar_semanas(mes, anno)

