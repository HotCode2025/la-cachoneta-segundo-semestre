class Vehiculo:
    def __init__(self, color, ruedas):
        self.color = color
        self.ruedas = ruedas

    def __str__(self):
        return f"[color: {self.color}, ruedas: {self.ruedas}]"

class Auto(Vehiculo):
    def __init__(self, color, ruedas, velocidad):
        super().__init__(color, ruedas)
        self.velocidad = velocidad

    def __str__(self):
        return f"Auto {super().__str__()}, velocidad: {self.velocidad}"

class Bicicleta(Vehiculo):
    def __init__(self, color, ruedas, tipo):
        super().__init__(color, ruedas)
        self.tipo = tipo

    def __str__(self):
        return f"Bicicleta {super().__str__()}, tipo: {self.tipo}"

vehiculo1 = Vehiculo("rojo", 4)
auto = Auto("azul", 4, 140)
bici = Bicicleta("negra", 2, "clasica")

print(vehiculo1)
print(auto)
print(bici)