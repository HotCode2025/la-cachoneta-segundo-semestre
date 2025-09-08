# Ejercicio 10: No repetir caracteres
# Hacer un programa que pida una cadena por teclado, luego
# meter los caracteres en una lista sin repetir caracteres
# Ejercicio 10: No repetir caracteres

cadena = input("Ingresá una cadena: ")
sin_repetidos = []
for caracter in cadena:
    if caracter not in sin_repetidos:
        sin_repetidos.append(caracter)
print("Lista sin caracteres repetidos:", sin_repetidos)