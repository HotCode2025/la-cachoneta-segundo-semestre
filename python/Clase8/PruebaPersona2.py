from Persona2 import Persona2
print('Creación de Objetos'.center(50, '-'))
if __name__ == '__main__':
    persona5 = Persona2('Lionel', 'Messi', 35)
    print(persona5.mostrar_detalle())

    print(__name__)

print('Eliminación de Objetos'.center(50, '-'))
del persona5