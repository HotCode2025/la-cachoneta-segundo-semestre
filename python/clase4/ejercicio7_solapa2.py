
#Ejercicio 7: Juego adivina el número
#Realizar un juego para adivinar un número.
#Para ello se debe generar un número aleatorio entre 1 - 100,
#y luego ir pidiendo números indicando "es mayor" o "es menor"
#según sea mayor o menor con respecto a N.
#El proceso termina cuando el usuario acierta
#y allí se debe mostrar el número de intentos.

# Juego adivina el número - versión básica sin random

numero = 42  # Número secreto fijo
intentos = 0

print("¡Bienvenido! Adiviná el número entre 1 y 100.")

while True:
    n = int(input("Tu intento: "))
    intentos += 1

    if n == numero:
        print(f"¡Correcto! Lo adivinaste en {intentos} intentos.")
        break
    elif n < numero:
        print("Es mayor.")
    else:
        print("Es menor.")