from mundo_pc.DispositivoEntrada import DispositivoEntrada

class Teclado(DispositivoEntrada):

    contador_teclados = 0

    def __init__(self, marca, tipo_entrada):
        Teclado.contador_teclados += 1
        self._id_teclado = Teclado.contador_teclados
        super().__init__(marca, tipo_entrada)

    def __str__(self):
        return f"ID: {self._id_teclado}, Marca: {self._marca}, Tipo de entrada: {self._tipo_entrada}"


if __name__ == '__main__':
    teclado1 = Teclado('Redragon', 'USB')
    print(teclado1)
    teclado2 = Teclado('Noga', 'Bluetooth')
    print(teclado2)

