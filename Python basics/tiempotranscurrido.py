def tiempo_transcurrido(hora1,minutos1,hora2,minutos2): 
    """int,int,int,int-->int,nt
    OBJ: Saber el tiempo entre dos momentos de tiempo
    PRE: 0=<hora1,hora2=<24 0=<minutos1,minutos<60"""
    minutos_totales=abs((hora1*60+minutos1)-(hora2*60+minutos2))
                 #Minutos mismo dia
    minutos_totales2=((24*60)-minutos_totales)%60 #Minutos días consecutivos
    horas=minutos_totales//60  #Reconversion a horas
    minutos=minutos_totales%60 #Minutos restantes
    if hora1>hora2:
        horas=(24-horas)
        minutos=minutos_totales2 #En caso de dia consecutivo
    return str(horas)+'h:'+str(minutos)+'m'

tiempo=int(input('hora 1 '))
tiempo2=int(input('minutos 1 '))
tiempo3=int(input('hora 2 '))
tiempo4=int(input('minutos 2 '))
print(tiempo_transcurrido(tiempo,tiempo2,tiempo3,tiempo4))
print(tiempo_transcurrido(11,00,11,15))
print(tiempo_transcurrido(12,33,20,33))
print(tiempo_transcurrido(12,30,14,15))
print(tiempo_transcurrido(23,55,2,15))
print(tiempo_transcurrido(6,15,19,30))
"""#Probador
print(tiempo_transcurrido(11,00,11,15))
print(tiempo_transcurrido(12,33,20,33))
print(tiempo_transcurrido(12,30,14,15))
print(tiempo_transcurrido(23,55,2,15))
print(tiempo_transcurrido(6,15,19,30))"""

