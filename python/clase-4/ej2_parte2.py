"""
Ejercicio 5: Factorial de un número positivo
Programa para calcular el factorial de un número entero positivo.
"""

numero_ingresado = int(input("Ingrese un número entero positivo: "))

if numero_ingresado < 0:
    print("Error: el factorial no está definido para números negativos.")
else:
    if numero_ingresado == 0:
        resultado_factorial = 1
    else:
        resultado_factorial = 1
        for valor in range(1, numero_ingresado + 1):
            resultado_factorial *= valor

    print(f"El factorial de {numero_ingresado} es: {resultado_factorial}")
