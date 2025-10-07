class Equipo2:

    def __init__(self, equipo, pais, fecha):
        self._equipo = equipo
        self._pais = pais
        self._fecha = fecha


    def mostrar_detalles(self):
        print(f"Los datos de los equipos son los siguientes: {self._equipo} {self._pais} {self._fecha}")
    @property
    def equipo(self):
        return self._equipo

    @equipo.setter
    def equipo(self, equipo):
        self._equipo = equipo

    @property
    def pais(self):
        return self._pais

    @pais.setter
    def pais(self, pais):
        self._pais = pais

    @property
    def fecha(self):
        return self._fecha

    @fecha.setter
    def fecha(self,fecha):
        self._fecha = fecha

equipo1 = Equipo2("Real Madrid", "España", 1902)
equipo2 = Equipo2("Barcelona", "España", 1899 )
equipo3 = Equipo2("Atletico de Madrid", "España", 1903)

equipo1.mostrar_detalles()
equipo2.mostrar_detalles()
equipo3.mostrar_detalles()

print("\n <- Ahora se modifican los datos con setters ->\n")
#Cambio al equipo 1
equipo1.equipo ="Juventus"
equipo2.pais = "Italia"
equipo3.fecha = 1897

print("Los datos entre los equipos se mezclaron y modificaron")
equipo1.mostrar_detalles()
equipo2.mostrar_detalles()
equipo3.mostrar_detalles()


