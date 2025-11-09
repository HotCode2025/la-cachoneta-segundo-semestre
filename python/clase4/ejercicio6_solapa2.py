# Ejercicio 6: Tabla de multiplicar
# Hacer un programa que pida un número por teclado y guarde
# en una lista su tabla de multiplicar hasta el 10. Por ejemplo:
# Si digita el 5 la lista tendrá: 5,10,15,20,25,30,35,40,45,50

# Ejercicio 6: Tabla de multiplicar

# Pedimos un número al usuario
numero = int(input("Ingrese un número para ver su tabla de multiplicar hasta el 10: "))

# Creamos la lista con la tabla de multiplicar
tabla = [numero * i for i in range(1, 11)]

# Mostramos el resultado
print("La tabla de multiplicar es:", tabla)