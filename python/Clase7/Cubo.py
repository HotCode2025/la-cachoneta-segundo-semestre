class Cubo:
    """
    Crear la calse Cubo con los atributos, ancho, alto y profuncidad, con un método calcular_volumen que tendrá la formula: volumen = ancho * altura * profundidad que el usuario ingrese los valores
    """
    def __init__(self, ancho, alto, profundidad):
        self.ancho = ancho
        self.alto = alto
        self.profundidad = profundidad

    def calcular_volumen(self):
        return self.ancho * self.alto * self.profundidad

cubo1 = Cubo(int(input("Digite el ancho (en cm): ")), int(input("Digite el alto (en cm): ")), int(input("Digite la profundidad (en cm): ")))
print(f"El volumen del cubo es: {cubo1.calcular_volumen()} cm^3")
