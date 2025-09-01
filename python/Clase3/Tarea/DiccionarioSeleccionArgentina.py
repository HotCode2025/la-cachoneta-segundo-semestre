seleccionArgentina = {
    10: {"Nombre": "Lionel Messi", "Edad": 38, "Altura": 1.70, "Precio": "18 Millones", "Posicion": "Extremo Derecho"},
    11: {"Nombre": "Franco Mastantuono", "Edad": 18, "Altura": 1.77, "Precio": "30 Millones", "Posicion": "Extremo Derecho"},
    24: {"Nombre": "Paulo Dybala", "Edad": 31, "Altura": 1.77, "Precio": "8 Millones", "Posicion": "Media Punta"},
    19: {"Nombre": "Facundo Medina", "Edad": 26, "Altura": 1.84, "Precio": "25 Millones", "Posicion": "Defensa Central"},
    6: {"Nombre": "Leonardo Balerdi", "Edad": 26, "Altura": 1.87, "Precio": "20 Millones", "Posicion": "Defensa Central"},
    12: {"Nombre": "Gerónimo Rulli", "Edad": 33, "Altura": 1.89, "Precio": "8 Millones", "Posicion": "Portero"},
    13: {"Nombre": "Cristian Romero", "Edad": 27, "Altura": 1.85, "Precio": "50 Millones", "Posicion": "Defensa Central"},
    21: {"Nombre": "Nicolás Otamendi", "Edad": 37, "Altura": 1.83, "Precio": "1 Millones", "Posicion": "Defensa Central"},
    8: {"Nombre": "Julio Soler", "Edad": 20, "Altura": 1.75, "Precio": "8 Millones", "Posicion": "Lateral Izquierdo"}
}

for llave, valor in seleccionArgentina.items():
    print(llave, valor)
print ("Tenemos cargados en el diccionario la cantidad de: " , end= " " )
print(len(seleccionArgentina))