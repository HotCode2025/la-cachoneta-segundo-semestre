def imprimir_descendente(n: int) -> None:
    if n > 0:
        print(n)
        imprimir_descendente(n - 1)


imprimir_descendente(5)
print("----")
imprimir_descendente(3)
print("----")
imprimir_descendente(-2)
