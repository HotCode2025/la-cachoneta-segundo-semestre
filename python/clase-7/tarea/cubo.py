
#No entendi el ejercicio, un cubo mide lo mismo en ancho, alto y profundidad si no no seria un cubo
class Cubo:
    def __init__(self, ancho, alto, profundidad):
        self.ancho = ancho
        self.alto = alto
        self.profundidad = profundidad

    def calcular_volumen(self):
        return self.ancho * self.alto * self.profundidad


# Programa principal
ancho = float(input("Ingrese el ancho del cubo: "))
alto = float(input("Ingrese el alto del cubo: "))
profundidad = float(input("Ingrese la profundidad del cubo: "))

cubo = Cubo(ancho, alto, profundidad)
print(f"El volumen del cubo es: {cubo.calcular_volumen()}")