# Ejercicio 2: Función con *args para multiplicar
# Crear una función para multiplicar los valores recibidos
# de tipo numérico, utilizando argumentos variables *args
# como parámetro de la función y regresar como resultado
# la multiplicación de todos los valores pasados como argumento

def multiplicar(*args):
    resultado = 1
    for valor in args:
        resultado *= valor
    return resultado

# Pedir al usuario que ingrese números separados por espacios
entrada = input("Ingrese números separados por espacio: ")

# Convertimos lo ingresado en una lista de enteros
numeros = [int(x) for x in entrada.split()]

# Usamos el operador * para pasar la lista como argumentos
resultado = multiplicar(*numeros)

print(f"La multiplicación de {numeros} es: {resultado}")
