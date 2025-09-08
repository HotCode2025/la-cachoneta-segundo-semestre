# Ejercicio 11: Agenda telefonica
# Hacer un programa que simule una agenda de contactos. Crear un
# diccionario donde la clave sea el nombre del usuario y el valor
# sea el teléfono, el programa tendrá el siguiente menú de opciones:
#                   1. Nuevo contacto
#                   2. Borrar contacto
#                   3. Ver contactos existentes
#                   4. Salir

agenda = {}
i = int(input("Digite 1 para añadir un nuevo contacto\nDigite 2 para borrar un contacto\nDigite 3 para ver sus contactos\nDigite 4 para salir: "))
while i != 4:
    if i == 1:
        print("\nA continuación agregara un contacto nuevo")
        nombre = input("Escriba el nombre del contacto: ")
        agenda[nombre] = int(input("Digite el número del contacto: "))
    if i == 2:
        print("\nA continuación borrara un contacto")
        nombre = input("Escriba el nombre del contacto a borrar: ")
        if nombre not in agenda:
            print("El nombre del contacto no existe")
        else:
            agenda.pop(nombre)
            print(f"Se ha eliminado {nombre} de la agenda")
    if i == 3:
        print("Lista de contactos: ")
        for contactos in agenda:
            print(f"Nombre: {contactos} | Num: {agenda[contactos]}")
    if i not in [1,2,3]:
        print("\nHa digitado una opcion equivocada")

    i = int(input("\nDigite su opción: "))