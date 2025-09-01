# Sumar números pares dentro de un rango

# Pedimos al usuario el inicio y el fin del rango
inicio = int(input("Ingrese el número de inicio del rango: "))
fin = int(input("Ingrese el número final del rango: "))

# Inicializamos la suma
suma = 0

# Recorremos el rango
for numero in range(inicio, fin + 1):
    if numero % 2 == 0:  # Verificamos si es par
        suma += numero

# Mostramos el resultado
print(f"La suma de los números pares entre {inicio} y {fin} es: {suma}")