# Ejercicio 9: Mostrar una frase sin espacios y contar su longitud
# Hacer un programa donde el usuario ingrese una frase, se le
# devolverá la misma frase pero sin espacios en blanco, y
# además un contador de cuantos caracteres tiene la frase
# (sin contar los espacios en blanco)
# Ejemplo:      frase = vivir por siempre en paz
#               frase final = vivirporsiempreenpaz
#               N° de caracteres = 20

def eliminarEspacios(frase):
    frase2 = ""
    for i in frase:
        if i != " ":
            frase2 += i
    return frase2

def contadorCaracteres(frase):
    contador = 0
    for i in frase:
        contador += 1
    print(f"La cantidad de caracteres de la frase es: {contador}")

frase = str(input("Ingresa una frase: "))
print(f"Esta es tu frase {frase}")
frase = eliminarEspacios(frase)
print(f"Esta es la frase final sin espacios: {frase}")
contadorCaracteres(frase)
