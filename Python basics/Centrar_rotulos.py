nColum=76 #tamaño actual de la pantalla
def centrarRotulo (rotulo):
    """string--> nada
    OBJ: centra rótulo, subrrayado con signos =, +linea encima y debajo
    PRE: tam(rotulo)<=tamaño de ventana """
    tam=len(rotulo)
    lado=(nColum-tam)//2-1
    print(' '*lado,rotulo,)
    print(' '*lado,'='*tam)
    print('\n')
#Probador
rotulo = 'El famoso hidalgo don Quijote de la Mancha'# mismo nombre
centrarRotulo(rotulo)
frase = 'Don Quijote de la Mancha'
centrarRotulo(frase) # distinto nombre
centrarRotulo('Cervantes') # constante
