#'Maradona':10 Un diccionario esta compuesto por dos elementos
#Una llave y un valor
#dict(key,value)
diccionario = {
    'IDE':'Integrated Development Enviroment',
    'POO':'Programacion Orientada a Objetos',
    'SABD':'Sistema de Administracion de Base de Datos'

}
print(diccionario)
print(len(diccionario))

#Acceder a un diccionario con la llave (key)
print(diccionario['IDE'])

#Recuperar elemento, otra forma
print(diccionario.get('POO'))
print(diccionario.get('SABD'))

#Modificamos elementos
diccionario['IDE'] = 'Entorno de Desarrollo Integrado'
print(diccionario)

for termino in diccionario: #Recorremos mostrando solo las llaves
    print(termino)

for termino, valor in diccionario.items():
    print(termino,valor)

#Otras maneras de acceder a un diccionario
for termino in diccionario.keys(): #Estamos usando una funcion
    print(termino) #Muestra solo las llaves

for valor in diccionario.values(): #Usamos una funcion para acceder al valor
    print(valor)

#Comprobar la existencia de algun elemento
print('IDE' in diccionario)

#Agregamos un elemento
diccionario['PK'] = 'Primary Key'
print(diccionario)

#Eliminar un elemento

diccionario.pop('SABD')
print(diccionario)

#Vaciar diccionario

diccionario.clear()
print(diccionario)

del diccionario