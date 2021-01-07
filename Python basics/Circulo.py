from math import pi
def area_circulo(radio): 
    """float-->float
    OBJ:area_circulo
    PRE:radio>0"""
    return  pi*radio*radio
print("area =",area_circulo(1))

def perimetro_circulo(radio):

    """float-->float
    OBJ:perimetro_circulo
    PRE:radio>0"""
   
    return  2*pi*radio

print("perimetro =",perimetro_circulo(1))
