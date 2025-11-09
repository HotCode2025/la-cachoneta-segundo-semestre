#ejercicio1
# Ejercicio 1: Eliminar duplicados de una lista
# Escriba un programa donde tenga una lista y que a continuación
# elimine los elementos repetidos, por último mostrar la lista.

# Creamos una lista
LaCachoneta = ['Samuel', 'German', 'Emma', 'Agustin', 'Esteban', 'Cristian', 'Ramiro', 'Nicolas', 'Mauro', 'Enzo',
               'Samuel', 'German', 'Emma', 'Agustin', 'Esteban', 'Cristian', 'Ramiro', 'Nicolas', 'Mauro', 'Enzo']
#mostramos la lista sin los elementos repetidos
sin_repetidos = list(set(LaCachoneta))
print(sin_repetidos)