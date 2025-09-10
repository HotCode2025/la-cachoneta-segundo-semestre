# lista de comprensión o list comprehension
names = ["Paolo", "Lupe", "Pepe"]
print([p for p in names if p[0] == 'P'])  # Esto regresa una nueva lista
print(names)

bottleC = [
    {"name": "Quilmes", "country": "Arg"},
    {"name": "Corona", "country": "MX"},
    {"name": "Stella Artois", "country": "Belgium"},
]

Arg = [b for b in bottleC if b["country"] == "Arg"]
print(Arg)
print(bottleC)