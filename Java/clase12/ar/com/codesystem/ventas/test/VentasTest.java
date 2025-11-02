package clase12.ar.com.codesystem.ventas.test;

import clase12.ar.com.codesystem.ventas.*;

public class VentasTest {
    public static void main(String[] args) {
        Producto producto1 = new Producto("Pantalon", 9500.00);
        Producto producto2 = new Producto("Campera", 29900.00);
        Producto producto3 = new Producto("Remera", 19900.00);
        Producto producto4 = new Producto("Short", 22900.00);
        Producto producto5 = new Producto("Zapatilla", 49900.00);
        Producto producto6 = new Producto("Gorra", 9900.00);
        Producto producto7 = new Producto("Medias", 5500.00);
        Producto producto8 = new Producto("Bermuda", 31900.00);
        Producto producto9 = new Producto("Boxer", 10900.00);
        Producto producto10 = new Producto("Cardigan", 49900.00);

        Orden orden1 = new Orden();
        // agregamos producots al arreglo
        orden1.agregarProducto(producto1);
        orden1.agregarProducto(producto2);
        orden1.agregarProducto(producto3);
        orden1.agregarProducto(producto4);
        orden1.mostrarOrden();

        Orden orden2 = new Orden();
        orden2.agregarProducto(producto1);
        orden2.agregarProducto(producto4);
        orden2.agregarProducto(producto7);
        orden2.agregarProducto(producto8);
        orden2.mostrarOrden();
        
        Orden orden3 = new Orden();
        orden3.agregarProducto(producto5);
        orden3.agregarProducto(producto6);
        orden3.agregarProducto(producto9);
        orden3.agregarProducto(producto10);
        orden3.mostrarOrden();
    }
}
