# Ejercicio 3: Agregar personajes a una lista
# Escriba un programa donde cree una lista con los siguientes personajes del señor de los anillos

# Nombre: Aragon
# Clase: Guerrero
# Raza: Dúnadan del norte

# Nombre: Gandalf
# Clase: Mago
# Raza: Istar

# Nombre: Legolas
# Clase Arquero
# Raza: Elfo Sindar

personajes = []

personajes.append({
    "Nombre": "Aragorn",
    "Clase": "Guerrero",
    "Raza": "Dúnadan del norte"
})

personajes.append({
    "Nombre": "Gandalf",
    "Clase": "Mago",
    "Raza": "Istar"
})

personajes.append({
    "Nombre": "Legolas",
    "Clase": "Arquero",
    "Raza": "Elfo Sindar"
})

for personaje in personajes:
    print(f"Nombre: {personaje['Nombre']}, Clase: {personaje['Clase']}, Raza: {personaje['Raza']}")