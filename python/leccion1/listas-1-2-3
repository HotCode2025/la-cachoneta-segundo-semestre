#lista: ariel, natalia, liliana, osvaldo
nombres = ["ariel", "natalia", "liliana", "osvaldo"]
print(nombres)
print(nombres[0])
print(nombres[-1])
print(nombres[-3])
print (nombres [0:2]) #solo muestra el indice 0,1 pero no muestra el indice 2
# ir del inicio de la lista al indice (sin incluirlo)
print (nombres[ :3]) #indices a mostrar 0,1,2
#desde el indice indicado hasta el final
print(nombres[1: ])
#modificamos un valor dentro de la lista
nombres[2] = "lili"
print(nombres)
#iterar una lista
for nombre in nombres: #nombre es singular la lista es plural
    print (nombre)
else:
    print ("se acabaron los elementos de la lista")

#preguntamos cuantos elementos tiene
print(len(nombres)) #le pasamos como parametro la lista

#agregamos un elemento
nombres.append("marcelo")
print (nombres)
 #insertar un elemento en un indice especifico
nombres.insert(1, 'alberto')
print(nombres)
nombres.insert(3, 'deborah')
print(nombres)
#eliminamos un elemento
nombres.remove('alberto')
print(nombres)
#eliminar el ultimo elemento
nombres.pop()
print(nombres)

#eliminar un indice especifco
del nombres [2] #del significa borrar
print(nombres)

#eliminar limpiar o borrar todos los elementos
nombres.clear()
print(nombres)

#eliminar la  lista
del nombres
#print(nombres)

#concatenar listas
lista1 = [1,2,3]
lista2 = [4,5,6]
lista3 = lista1+lista2
print(lista3)
#funcion para agregar varios elementos a una lista
lista3.extend([7,8,9])
print(lista3)
#como saber en que posicion esta un valor dentro de una lista
print (lista3.index(6))
#como saber cuantos valores repetidos hay dentro de una lista
print(lista3.count(4))

#para poner al reves una lista
lista3.reverse()
print(lista3)

# Para que una lista se multiplique repitiendo sus elementos
lista3 = lista3 * 2
print(lista3)

# Métodos de ordenamiento, en Python es una función
lista3.sort()  # Ordena los elementos ascendentemente
print(lista3)
lista3.sort(reverse=True)  # Ordena descendentemente
print(lista3)

# Repaso de Tuplas
tupla = (4, 'Hola', 6.78, [1, 2, 78], 4, 'Hola')  # Puede tener diferentes tipos de datos dentro
print(tupla)

print(4 in tupla)  # Acción booleana, su respuesta es de tipo booleana
# Lo que podemos usar dentro de tuplas son: index, count, len
# En tuplas se puede convertir de tupla a lista y de lista a tupla