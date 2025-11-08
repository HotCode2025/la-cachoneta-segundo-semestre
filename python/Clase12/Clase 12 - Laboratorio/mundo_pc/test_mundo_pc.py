from mundo_pc.Computadora import Computadora 
from mundo_pc.Monitor import Monitor 
from mundo_pc.Teclado import Teclado 
from mundo_pc.Raton import Raton
from mundo_pc.Orden import Orden

teclado1 = Teclado('HP', 'USB')
monitor1 = Monitor('Samsung', '15 pulgadas')
raton1 = Raton('Razer', 'USB')
computadora1 = Computadora('Acer', monitor1, teclado1, raton1)

teclado2 = Teclado('Noga', 'Bluetooth')
monitor2 = Monitor('LG', '17 pulgadas')
raton2 = Raton('Logitech', 'Bluetooth')
computadora2 = Computadora('Lenovo', monitor2, teclado2, raton2)

computadoras1 = [computadora1, computadora2]
orden = Orden(computadoras1)

