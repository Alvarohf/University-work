#Mostrar tablas de multiplicar pares
def mostrar_tablas_pares():
    """ -->str
    OBJ: Mostrar las tablas de multiplicar pares"""
    print('\t\tTablas de multiplicar pares')
    print('\t\t===========================','\n',end='')
    print('       ',end='')
    for multiplicador in range(1,11,1):
        print('%5d'%(multiplicador),end='')
    print('\n','_______'*10)
    print('\n')
    
    for multiplicando in range(2,11,2):#Numeros pares
        print('%5d'%(multiplicando),'|',end='') 
        for multiplicador in range(1,11,1):#Del 1 al 10
           print('%5d'%(multiplicando*multiplicador),end='') 
        print('\n')         
mostrar_tablas_pares()
    
