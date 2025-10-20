from Clase11.Producto import Producto


class Orden:
    contador_ordenes = 0

    def __init__(self, productos):
        Orden.contador_ordenes += 1
        self.id_orden = Orden.contador_ordenes
        self._productos = list(productos)
        
    def agregar_productos(self, producto):
        self._productos.append(producto)
    
    def calcular_total(self):
        total = 0 #Variable temporal
        for producto in self._productos:
            total += producto.precio
        return total
    def __str__(self):
        productos_str = ""
        for producto in self._productos:
            productos_str += producto.__str__()+"|"
        return f"Orden: {self.id_orden}, \nProducto: {productos_str}"
if __name__ == '__main__':
    producto1 = Producto("Camiseta", 100.00)
    producto2 = Producto("Pantalon", 150.00)   
    producto3 = Producto("Medias", 50.00)
    producto4 = Producto("Chalecos", 444.44)
    productos1 = [producto1, producto2,producto3]
    orden1 = Orden(productos1)
    orden1.agregar_productos(producto4)
    print(orden1)
    print(f"Total de la orden1: {orden1.calcular_total()}")

    producto1 = Producto("Buzo", 50.00)
    producto2 = Producto("Zapatillas", 444.44)
    producto3 = Producto("Guantes", 10.00)
    producto2 = [producto1, producto2,producto3]
    orden2 = Orden(producto2)
    print(orden2)
    print(f"Total de la orden2: {orden2.calcular_total()}")

 
    
    



