def estacion(dia,mes):
    """int,int-->str
    OBJ: estación segun mes y dias dados
    PRE: mes y dia fecha valida"""
    mmdd=mes*100+dia
    if mmdd<=319:estacion="primavera"
    elif mmdd<=619:estacion="verano"
    elif mmdd<=1221:estacion="otoño"
    else:estacion="invierno"
    return estacion
dia=int(input("Dia del año"))
mes=int(input("Mes del año"))
print(estacion(dia,mes))
