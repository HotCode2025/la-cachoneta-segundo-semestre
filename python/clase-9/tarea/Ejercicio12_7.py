# Ejercicio de la Clase 9 Parte 5 indice 12.7

# Creo las clases FiguraGeometrica, Color, Cuadrado y Rectangulo

class FiguraGeometrica:
    def __init__(self, alto, ancho):
        self._alto = alto
        self._ancho = ancho

    def get_alto(self):
        return self._alto
    def set_alto(self, alto):
        self._alto = alto
    def get_ancho(self):
        return self._ancho
    def set_ancho(self, ancho):
        self._ancho = ancho

    def __str__(self):
        return f"FiguraGeometrica: [alto={self._alto}, ancho={self._ancho}]"

class Color:
    def __init__(self, color):
        self._color = color

    def get_color(self):
        return self._color

    def set_color(self, color):
        self._color = color

    def __str__(self):
        return f"Color: [color={self._color}]"

class Cuadrado (FiguraGeometrica, Color):
    def __init__(self, alto, ancho, color):
        FiguraGeometrica.__init__(self, alto, ancho)
        Color.__init__(self, color)
    
    def area(self):
        if self._alto == self._ancho:
            return self._alto * self._ancho
        else:
            print("El alto y el ancho no son iguales, cambia el ancho y el alto hasta que sean iguales")

    def __str__(self):
        if self._alto == self._ancho:
            return f"Cuadrado: [alto={self._alto}, ancho={self._ancho}, area={self.area()}, color={self._color}]"
        else:
            print("El alto y el ancho no son iguales, cambia el ancho y el alto hasta que sean iguales")

class Rectangulo(FiguraGeometrica, Color):
    def __init__(self, alto, ancho, color):
        FiguraGeometrica.__init__(self, alto, ancho)
        Color.__init__(self, color)

    def area(self):
        return self._alto * self._ancho

    def __str__(self):
        return f"Rectangulo: [alto={self._alto}, ancho={self._ancho}, area={self.area()}, color={self._color}]"

# Creo los objetos y los muestro en pantalla

cuadrado1 = Cuadrado(12,12,"naranja")
print("Muestro en pantalla los atributos del objeto cuadrado1 sin usar __str__")
print(f"cuadrado1: Alto = {cuadrado1.get_alto()}, Ancho = {cuadrado1.get_ancho()}, Color = {cuadrado1.get_color()}")
print(f"Area de cuadrado1: {cuadrado1.area()}")
print("Muestro todo el objeto cuadrado1 con __str__")
print(cuadrado1.__str__())

rectangulo1 = Rectangulo(12,23,"rojo")
print("\nMuestro en pantalla los atributos del objeto rectangulo1 sin usar __str__")
print(f"rectangulo1: Alto = {rectangulo1.get_alto()}, Ancho = {rectangulo1.get_ancho()}, Color = {rectangulo1.get_color()}")
print(f"Area de rectangulo1: {rectangulo1.area()}")
print("Muestro todo el objeto rectangulo1 con __str__")
print(rectangulo1.__str__())