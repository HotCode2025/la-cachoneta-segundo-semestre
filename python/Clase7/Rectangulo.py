class Rectangulo:
    """
    Crear una clase llamada Rectángulo, debe tenér 2 atributos: altura y base el nombre del método sera calcular_area utilizando la formula: area = base * altura. Pero la base y la altura deben ser ingresadas por el usuario y los objetos deben ser tres.
    """
    def __init__(self, altura, base):
        self.altura = altura
        self.base = base

    def calcular_area(self):
        return self.base * self.altura

print("Primer rectángulo")
rectangulo1 = Rectangulo(int(input("Digite la altura (en cm): ")), int(input("Digite la base (en cm): ")))
print(f"El area del rectángulo n°1 es: {rectangulo1.calcular_area()} cm^2\n")

print("Segundo rectángulo")
rectangulo2 = Rectangulo(int(input("Digite la altura (en cm): ")), int(input("Digite la base (en cm): ")))
print(f"El area del rectángulo n°2 es: {rectangulo2.calcular_area()} cm^2\n")

print("Tercer rectángulo")
rectangulo3 = Rectangulo(int(input("Digite la altura (en cm): ")), int(input("Digite la base (en cm): ")))
print(f"El area del rectángulo n°3 es: {rectangulo3     .calcular_area()} cm^2\n")
