# Desempaquetado de listas o List Unpacking

def show(name, lastName):
    print(name, lastName)

person = ["Ariel", "Betancud"]
show(person[0], person[1])  # Pasamos uno por uno los datos de la lista a la función
show(*person)               # Esto es lo mismo que lo anterior pero le pasamos todo junto

person2 = ["Osvaldo", "Giordanini"]  # Desempaquetamos a través de una tupla
show(*person2)

person3 = {"lastName": "Lucero", "name": "Natalia"}
show(**person3)