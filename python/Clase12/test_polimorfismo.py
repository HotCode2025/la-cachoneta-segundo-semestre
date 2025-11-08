from Empleado import Empleado  
from Gerente import Gerente

def imprimir_detalles(objeto):
    # print(objeto) # De manera indirecta llama al str de la clase Empleado o Gerente
    print(type(objeto)) # Para saber el tipo de dato que recibe
    print(objeto.mostrar_detalles())
    if(isinstance(objeto, Gerente)):
        print(objeto.departamento)

empleado1 = Empleado("Esteban", 50000)
imprimir_detalles(empleado1)

gerente1 = Gerente("Pedro", 200000, "Sistemas")
imprimir_detalles(gerente1)
