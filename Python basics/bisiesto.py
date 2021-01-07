
def esBisiesto(anno):
    """int-booleano
    OBJ:esAnnoBisiesto
    PRE:anno actual>anno inicial"""
    return anno%4==0 and anno%100!=0 or anno%400==0

