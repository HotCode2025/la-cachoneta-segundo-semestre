planets = {"Marte", "Júpiter", "Venus"}
print(planets)
print(len(planets))

print("Marte" in planets)
print("Martes" in planets)
print("Júpiter" not in planets)

planets.add("Tierra")
planets.add("Tierra")
print(planets)

planets.remove("Júpiter")
print(planets)

planets.discard("Tierra")
print(planets)

planets.discard("Marte")
print(planets)

planets.clear()
print(planets)

del planets
