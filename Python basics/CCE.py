pais=('Alemania', 'Francia','Reino Unido','Italia','España', 'Países Bajos', 'Polonia', 'Bélgica', 'Suecia', 'Austria', 'Grecia','Rumania', 'República Checa', 'Portugal', 'Dinamarca', 'Hungría', 'Irlanda', 'Finlandia',
            'Eslovaquia', 'Bulgaria' , 'Lituania', 'Eslovenia', 'Letonia', 'Luxemburgo', 'Estonia', 'Chipre', 'Malta')
constantePais = 2
def posicionPais (paises):
    """tupla--->str
    OBJ: Devolver la posición de un elemento de la tupla
    PRE: cincoPaises debe estar definida, n debe ser un int"""
    n=int(input('Introduzca la posición deseada: '))
    print(paises[n-1])      
def estaEnTupla (paises):
    """ tuple-->str
    OBJ: comprueba si un país está en la tupla de los cinco primeros países.
    PRE: la tupla cincoPaises debe estar definida; país debe ser un str; la primera letra del país que se desea buscar debe ir en mayúscula .                            """
    pais = input('Introduzca el país que desa comprobar: ')
    print (pais in paises)
def contadorDePoblacion(nHabitantes, poblaciones):
    """int, tuple-->int
    OBJ: Encontrar los países con una población mayor a la introducida
    PRE: valor introducido>=0                                           """
    contadorPais=0    
    for i in range (len(poblaciones)):
        if poblacion[i]>nHabitantes:
            contadorPais+=1
    return contadorPais    
def poblacionPaises(poblaciones,constantePais):
    """tuple-->int
    OBJ: Devolver la suma de población de los cinco primeros países
    PRE: Tupla con los valores de población                          """
    sumaPoblacion=0
    for i in range(0,constantePais):
        sumaPoblacion = sumaPoblacion+poblaciones[i]
    return sumaPoblacion
def tablaConPorcentaje(poblaciones,constantePais):
    """tuple-->int
    OBJ: Devolver la suma de población de los cinco primeros países
    PRE: Tupla con los valores de población                          """
    porcentajes=()
    for i in range(0,constantePais):
        porcentajePoblacion= round((poblaciones[i]/poblacionPaises(poblaciones,constantePais))*100,4)
        porcentajes+=(porcentajePoblacion,)
    return porcentajes
poblacion=(82605000,64770000,65893000,60721000,46427000,17091000,38453000,11354000,
           9985000,8779000,11548000,200340000,10545000,10265000,5739000,9790000,4809000,
           5506000,5433000,7110000,2852000,2066000,1953000,590000,1316000,850000,437000)
def tablaPaises(poblacion, pais, constantePais):
    """tuple, tuple
    OBJ: Imprimir dos tablas, una con los nombres de los paises y otra con su población
    PRE: importar la tupla población y crear una con los nombres de los paises           """             
    print('Paises','\t\t\t','Población','\t\t','Porcentaje')
    print('________________ ',' ___________________',' ___________________')
    for i in range(constantePais):
        print('%12s'%(pais[i]),'\t\t', end='')
        print(poblacion[i],'\t\t', end='')
        print(tablaConPorcentaje(poblaciones,constantePais)[i],'\t\t', end='')
        print('\n')



def rentaMedia (poblaciones, rentas, constantePais):
    """tuple, tuple, tuple, int---> int
    OBJ: Calcular la RPC media de los 5 paises"""
    rMedia = 0
    for i in range(constantePais):
        rMedia+= (rentas[i]*poblaciones[i])/poblacionPaises(poblaciones,constantePais)
    return rMedia  

def recorrerTupla (poblaciones, constantePais,paises):
    """int--> str
    OBJ: Encontrar los paises con menos poblecion de la introducida
    PRE: poblacionComparar<=0                                               """
    poblacionComparar= int(input('Introduzca la población a comparar: '))
    i=0
    print(len(poblaciones))
    while i<len(poblaciones):
        i+=1
        if poblaciones[i-1]<poblacionComparar:
           print(paises[i-1])

def introducir_pais ():
    """str,int,int--> tupla,tupla,tupla
    OBJ: Hacer una tupla con todos los paises introducidos    """
    pais=''
    paises=()
    rentas=()
    poblaciones=()
    while pais!='fin':
       pais=input('Escriba el pais o fin para salir ')
       if pais!='fin':
           #Necesario para evitar que se añadan valores erroneos
           poblacion=int(input('Escriba la población del pais '))
           renta=int(input('Escriba la renta del pais '))
           paises+= (pais,)
           poblaciones+= (poblacion,)
           rentas+= (renta,)
    return paises,rentas,poblaciones
paises,rentas,poblaciones=(introducir_pais ())
rentaMedia (poblaciones, rentas, constantePais)
recorrerTupla (poblaciones, constantePais,paises)
tablaPaises(poblaciones, paises, constantePais)
nHabitantes=int(input('Introduzca el número de habitantes del país: '))
