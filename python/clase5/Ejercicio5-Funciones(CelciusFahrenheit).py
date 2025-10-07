#Ejercicio 5: Convertidor de temperaturas
#Realizar dos funciones para convertir de grados celcius
#a fahrenheit y

def celsius_a_fahrenheit(celcius):
    return (celcius * 9/5) + 32

#Ahora voy a pasar de Fahrenheits a Celcius

def fahrenheit_a_celcius(fahrenheit):
    return (fahrenheit - 32) * 5/9

c = float(input("Ingrese valor en Celcius: "))
f = celsius_a_fahrenheit(c)
print(f"{c}°C son {f:.2f}°F")

f = float(input("Ingrese Valor en Fahrenheits: "))
c = fahrenheit_a_celcius(f)
print(f"{f}°F son {c:.2f}°C")

