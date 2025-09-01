tupla = (13, 1, 8, 3, 2, 5, 8) #definimos la tupla
# crear una lista que solo incluya los numeros menores a 5
# e imprima por consola [1,3,2]

lista = []
# filtramos los elementos menores a 5 de la tupla
for numero in tupla:
    if numero < 5: 
        lista.append(numero)

print(lista)