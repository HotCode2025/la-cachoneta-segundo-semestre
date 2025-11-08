from mundo_pc.Teclado import Teclado
from mundo_pc.Raton import Raton
from mundo_pc.Monitor import Monitor

class Computadora:

    contador_computadoras = 0

    def __init__(self, nombre, monitor, teclado, raton):
        Computadora.contador_computadoras += 1
        self._id_computadora = Computadora.contador_computadoras
        self._nombre = nombre
        self._monitor = monitor
        self._teclado = teclado
        self._raton = raton

    def __str__(self):
        return f"""
        {self._nombre}: {self._id_computadora}
        Monitor: {self._monitor}
        Teclado: {self._teclado}
        Raton: {self._raton}
        """

if __name__ == '__main__':
    teclado1 = Teclado('Redragon', 'USB')
    raton1 = Raton('Razer', 'USB')
    monitor1 = Monitor('Samsung', '15 pulgadas')
    computadora1 = Computadora('Acer', monitor1, teclado1, raton1)
    print(computadora1)

    teclado2 = Teclado('Noga', 'Bluetooth')
    raton2 = Raton('Logitech', 'Bluetooth')
    monitor2 = Monitor('LG', '17 pulgadas')
    computadora2 = Computadora('Lenovo', monitor2, teclado2, raton2)
    print(computadora2)