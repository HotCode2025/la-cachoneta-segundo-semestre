# Ejercicio 2: Operaciones de conjuntos con listas
#
# Programa que toma 2 listas y genera nuevas listas
# aplicando operaciones de conjuntos (sin repeticiones).

lenguajes_lista1 = ["python", "java", "javascript", "c++", "python", "php"]
lenguajes_lista2 = ["ruby", "python", "c#", "go", "java", "c++"]

print(f"Lista 1 original: {lenguajes_lista1}")
print(f"Lista 2 original: {lenguajes_lista2}")
print("-" * 40)

conjunto_lenguajes1 = set(lenguajes_lista1)
conjunto_lenguajes2 = set(lenguajes_lista2)

lenguajes_union = list(conjunto_lenguajes1 | conjunto_lenguajes2)
print(f"1. Lenguajes presentes en al menos una de las listas: {lenguajes_union}")

lenguajes_solo_lista1 = list(conjunto_lenguajes1 - conjunto_lenguajes2)
print(f"2. Lenguajes que aparecen solo en la lista 1: {lenguajes_solo_lista1}")

lenguajes_solo_lista2 = list(conjunto_lenguajes2 - conjunto_lenguajes1)
print(f"3. Lenguajes que aparecen solo en la lista 2: {lenguajes_solo_lista2}")

lenguajes_en_ambas = list(conjunto_lenguajes1 & conjunto_lenguajes2)
print(f"4. Lenguajes que aparecen en ambas listas: {lenguajes_en_ambas}")
