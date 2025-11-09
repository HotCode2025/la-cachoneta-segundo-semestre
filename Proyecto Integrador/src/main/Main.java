package main;

import javax.swing.JOptionPane;

import clases.Producto;
import clases.Verduleria;

public class Main {
	public static void main(String[] args) {
		Verduleria verduleria = new Verduleria();
		boolean salir = false;
		Producto producto;
		double precio;
		int stock;

		while (!salir) {
			String opcion = JOptionPane.showInputDialog(
					"=== Verdulería de Cacho ===\n"
							+ "1. Mostrar productos\n"
							+ "2. Agregar producto\n"
							+ "3. Vender producto\n"
							+ "4. Modificar producto\n"
							+ "5. Eliminar producto\n"
							+ "6. Mostrar stock crítico\n"
							+ "7. Mostrar total de ventas\n"
							+ "8. Salir");

			if (opcion == null)
				break;

			switch (opcion) {
				case "1":
					JOptionPane.showMessageDialog(null, verduleria.mostrarProductos());
					break;

				case "2":
					String nombre = JOptionPane.showInputDialog("Ingrese nombre del producto:");
					producto = verduleria.buscarProducto(nombre);
					if (producto == null) {
						precio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese precio:"));
						stock = Integer.parseInt(JOptionPane.showInputDialog("Ingrese stock inicial:"));
						verduleria.agregarProducto(nombre, precio, stock);
						JOptionPane.showMessageDialog(null, "Producto agregado correctamente.");
					} else {
						JOptionPane.showMessageDialog(null, "El producto ya existe.");
					}
					break;

				case "3":
					JOptionPane.showMessageDialog(null, verduleria.mostrarProductos());
					nombre = JOptionPane.showInputDialog("Ingrese producto a vender:");
					producto = verduleria.buscarProducto(nombre);
					if (producto != null) {
						int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese cantidad:"));
						verduleria.venderProducto(producto, cantidad);
					} else {
						JOptionPane.showMessageDialog(null, "Error: producto inexistente o stock insuficiente.");
					}
					break;

				case "4":
					nombre = JOptionPane.showInputDialog("Escriba el nombre del producto a modificar precio y stock:");
					producto = verduleria.buscarProducto(nombre);
					if (producto != null) {
						precio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el nuevo precio: "));
						stock = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el nuevo stock: "));
						verduleria.modificarPrecio(producto, precio);
						verduleria.modificarStock(producto, stock);
						JOptionPane.showMessageDialog(null, "Producto modificado");
					} else {
						JOptionPane.showMessageDialog(null, "Producto no encontrado");
					}
					break;

				case "5":
					nombre = JOptionPane.showInputDialog("Ingrese nombre del producto a eliminar:");
					producto = verduleria.buscarProducto(nombre);
					if (producto != null) {
						int respuesta = Integer.parseInt(JOptionPane.showInputDialog("Esta seguro de eliminar el producto [" + nombre + "]?\n"
								+ "1. Si\n"
								+ "2. No"));
						switch (respuesta) {
							case 1:
								verduleria.eliminarProducto(nombre);
								JOptionPane.showMessageDialog(null, "El producto eliminado correctamente.");
								break;
							case 2:
								JOptionPane.showMessageDialog(null, "El producto no se ha eliminado.");
								break;
							default:
								JOptionPane.showMessageDialog(null, "Digite 1 o 2");
						}
					}
					break;

				case "6":
					int limite = Integer.parseInt(JOptionPane.showInputDialog("Ingrese límite de stock crítico:"));
					JOptionPane.showMessageDialog(null, verduleria.mostrarStockCritico(limite));
					break;

				case "7":
					JOptionPane.showMessageDialog(null, "Total de ventas: $" + verduleria.getTotalVentas());
					break;

				case "8":
					salir = true;
					break;

				default:
					JOptionPane.showMessageDialog(null, "Opción inválida.");
			}
		}

		JOptionPane.showMessageDialog(null, "Gracias por usar Verdulería de Cacho");
	}
}
