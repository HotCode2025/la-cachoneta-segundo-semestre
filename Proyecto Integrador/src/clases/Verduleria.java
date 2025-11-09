package clases;
import java.util.ArrayList;

public class Verduleria {
    private ArrayList<Producto> productos;
    private double totalVentas;

    public Verduleria() {
        productos = new ArrayList<>();
        totalVentas = 0;
        inicializarProductos(); 
    }

    private void inicializarProductos() {
        agregarProducto("manzana", 100, 50);
        agregarProducto("banana", 80, 30);
        agregarProducto("tomate", 120, 40);
        agregarProducto("papa", 60, 100);
        agregarProducto("anana", 90, 60);
        agregarProducto("coco", 200, 25);
        agregarProducto("pimiento rojo", 150, 35);
        agregarProducto("kiwi", 140, 40);
        agregarProducto("naranja", 110, 50);
        agregarProducto("mandarina", 95, 45);
        agregarProducto("pera", 300, 20);
        agregarProducto("acelga", 70, 55);
        agregarProducto("cebolla", 85, 60);
    }

    public void agregarProducto(String nombre, double precio, int stock) {
        productos.add(new Producto(nombre, precio, stock));
    }

    public Producto buscarProducto(String nombre) {
        for (Producto p : productos) {
            if (p.getNombre().equalsIgnoreCase(nombre)) {
                return p;
            }
        }
        return null;
    }

    public String mostrarProductos() {
        if (productos.isEmpty()) {
            return "No hay productos cargados.";
        }

        StringBuilder sb = new StringBuilder("Listado de productos:\n");
        for (Producto p : productos) {
            sb.append("- ").append(p.toString()).append("\n");
        }
        return sb.toString();
    }

    public void venderProducto(Producto p, int cantidad) {
        p.reducirStock(cantidad);
        totalVentas += p.getPrecio() * cantidad;
    }

    public void modificarPrecio(Producto p, double nuevoPrecio) {
        p.setPrecio(nuevoPrecio); 
    }

    public void modificarStock(Producto p, int nuevoStock) {
        p.setStock(nuevoStock); 
    }

    public String mostrarStockCritico(int limite) {
        StringBuilder sb = new StringBuilder("Productos con stock crítico:\n");
        for (Producto p : productos) {
            if (p.getStock() <= limite) {
                sb.append(p.toString()).append("\n");
            }
        }
        return sb.length() > 30 ? sb.toString() : "No hay productos con stock crítico.";
    }

    public double getTotalVentas() {
        return totalVentas;
    }

    public void eliminarProducto(String nombre) {
        if (buscarProducto(nombre) != null) {
            productos.remove(buscarProducto(nombre));
        }
    }
}
