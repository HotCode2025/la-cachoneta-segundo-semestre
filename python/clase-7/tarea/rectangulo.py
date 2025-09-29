"""
crear una clase llamada rectangulo, debe tener 2 atributos: altura y base
el nombre del metodo sera calcular area utilizando la formula:
area = base * altura. Pero la base y la altura deben ser ingresadas por el usuario
y los objetos deben ser tres.
"""

class Rectangulo():
    def __init__(self, base, altura):
        self.base = base
        self.altura = altura
    
    def calcular_area(self):
        return f"El area es: {self.base * self.altura}"
        

for i in range(3):
    print(f"Rectangulo {i + 1}")
    base = float(input("Ingrese la base del rectangulo: "))
    altura = float(input("Ingrese la altura del rectangulo: "))
    rectangulo = Rectangulo(base, altura)
    print(rectangulo.calcular_area())
