package clases;
public class Producto {
    private String nombre;
    private double precio;
    private int stock;

    public Producto(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        if (precio >= 0) {
            this.precio = precio;
        }
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        if (stock >= 0) {
            this.stock = stock;
        }
    }

    public boolean hayStock(int cantidad) {
        return cantidad <= stock;
    }

    public void reducirStock(int cantidad) {
        if (cantidad <= stock) {
            stock -= cantidad;
        }
    }

    @Override
    public String toString() {
        return nombre + " - $" + precio + " - Stock: " + stock;
    }
}