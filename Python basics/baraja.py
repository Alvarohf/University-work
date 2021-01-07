#Crea la baraja y barajea las cartas
palos=('copas','oros','bastos','espadas')
figuras=('As','2', '3','4','5','6','7','Sota','Caballo','Rey' )
valores=(1,1,12,4,5,6,7,10,11,12)#No son 10 para saber su orden de prelacion
mano=[[11, 1, 8, 5],[10, 17, 18, 30]]
mano2=[1, 2, 3, 4]
valores=(1,1,13,4,5,6,7,10,11,12)#No son 10 para saber su orden de prelacion
jug=1
f=10
lista=['grande','chica','pares','juego']
def corta_apuesta(jug):
   apuesta_g=apuesta_c=apuesta_p=apuesta_j=''
   grande=input('¿Quiere ir a grande?Si es asi escriba grande o ayuda si no sabe que hacer: ')
   if grande=='ayuda':
      print('\n--JUEGO--\n-Escriba grande para ir a grandes \n-Escriba pequena para ir a por pequeñas \n-Escriba pares para ir a pares \n-Escriba juego para ir a juego\n\n--APUESTAS-- \n-Escriba envidar para apostar 2\n-Escriba ordago para apostar todo--NORMAS--\n -Si no sabe las normas visite http://www.nhfournier.es/public/assets/Reglamentos_5/Reglamento_El_Mus.pdf ')
      cortar()
   chica=input('¿Quiere ir a chica?Si es asi escriba chica: ')
   pares=input('¿Quiere ir a pares?Si es asi escriba pares: ')
   juego=input('¿Quiere ir a juego?Si es asi escriba juego: ')
   if grande=='grande':apuesta_g=input('¿Que quieres apostar en grande?Si no sabe que hacer escriba ayuda: ')
   if chica=='chica':apuesta_c=input('¿Que quieres apostar en chica? ')
   if pares=='pares':apuesta_p=input('¿Que quieres apostar en pares? ')
   if juego=='juego':apuesta_j=input('¿Que quieres apostar en juego? ')
   apuestas=(apuesta_g,apuesta_c,apuesta_p,apuesta_j)
   cantidad=[]
   for apuesta in apuestas:
      if apuesta=='envidar': cantidad+=[2]
      elif apuesta=='ordago': cantidad+=[40]
      else: cantidad+=[0]
   return [jug]+cantidad

print(corta_apuesta(jug))

def baraja_letra(a,palos,figuras):
    """lista,tupla,tupla-->lista[str]
    OBJ: Mostrar la baraja en letra
    PRE: Baraja de 40 cartas"""
    mezclada=[]
    for cartas in a:
        palo=palos[(cartas-1)//10]
        figura=figuras[(cartas-1)%10]
        mezclada=mezclada+[figura+' de '+palo]
    return mezclada
def preguntar(mano,jug):
    a=[]
    accion=input('¿Que quiere hacer? Si necesita ayuda escriba ayuda: ')
    if accion=='ayuda': print('--TURNO--\n-Escriba puntos para consultar puntos de tu equipo\n-Escriba mirar para volver a ver las cartas\n-Escriba mus para pasar\n-Escriba cortar para jugar\n--NORMAS--\n -Si no sabe las normas visite http://www.nhfournier.es/public/assets/Reglamentos_5/Reglamento_El_Mus.pdf ')
    elif accion=='mirar': print(baraja_letra(mano[jug],palos,figuras))
    elif accion=='mus': mus(jug)
    elif accion=='cortar':cortar(jug)
    elif accion=='puntos':puntos(jug)
    else: print('Si no sabe que hacer escriba ayuda')    
        
    return a
while f<40: preguntar(mano,jug)

print(baraja_letra(a,palos,figuras))
