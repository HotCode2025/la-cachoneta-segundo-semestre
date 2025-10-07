class Persona:
    def __init__(self, nombre, edad):
        self.__nombre = nombre
        self.__edad = edad
    
    @property
    def nombre(self):
        return self.__nombre
    
    @nombre.setter
    def nombre(self, nombre):
        self.__nombre = nombre

    @property
    def edad(self):
        return self.__edad
    
    @edad.setter
    def edad(self, edad):
        self.__edad = edad

    def __str__(self): #Override = sobreescribir
        return f'Persona:[Nombre: {self.__nombre}, Edad: {self.__edad}]'

class Empleado(Persona): #Esta clase es hija de la clase persona
    def __init__(self, nombre, edad, sueldo):
        super().__init__(nombre, edad)
        self.__sueldo = sueldo

    @property
    def sueldo(self):
        return self.__sueldo
    
    @sueldo.setter
    def sueldo(self, sueldo):
        self.__sueldo = sueldo

    def __str__(self): #Override = sobreescribir
        return f'Empleado:[Sueldo: {self.__sueldo}] {super().__str__()}'

empleado1 = Empleado("Enzo", 40, 75000)
print(empleado1.nombre)
print(empleado1.edad)
print(empleado1.sueldo)


# Tarea: encapsular los atributos y agregar los metodos getters and setters
# Crear otro objeto, pasar los datos para nombre, edad y sueldo
# Mostrar estos datos, luego modificar y mostrar nuevamente

empleado2 = Empleado("Carlos", 30, 60000)
print("Nombre:", empleado2.nombre)
print("Edad:", empleado2.edad)
print("Sueldo:", empleado2.sueldo)

empleado2.nombre = "Carlos Fernández"
empleado2.edad = 31
empleado2.sueldo = 65000
print("Nombre:", empleado2.nombre)
print("Edad:", empleado2.edad)
print("Sueldo:", empleado2.sueldo)