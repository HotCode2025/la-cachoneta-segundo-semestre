# Modificar los elementos de una lista

# Cree la lista con los números del 1 al 10
lista = list(range(1, 11))

print("Lista original:", lista)

# Le Pido al usuario un número para multiplicar
multiplicador = int(input("Ingrese un valor para multiplicar los elementos de la lista: "))

# Modifica la lista multiplicando cada elemento
for i in range(len(lista)):
    lista[i] *= multiplicador

# lista modificada
print("Lista modificada:", lista)