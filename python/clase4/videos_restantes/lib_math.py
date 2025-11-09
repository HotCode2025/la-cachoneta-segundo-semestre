import math 
numero = int(input('Digite un numero positivo: '))
while numero < 0:
    print('Error -> deberia ser un numero positivo')
    numero = int(input('Digite un numero positivo: '))
print(f'\n Su raiz cuadrada es: {math.sqrt(numero):.2f}')