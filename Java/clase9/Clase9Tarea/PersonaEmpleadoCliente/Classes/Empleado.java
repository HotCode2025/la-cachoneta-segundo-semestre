package Classes;

public class Empleado extends Persona {
	private static int idEmpleado = 0;
	private double sueldo;

	public Empleado(String nombre, char genero, int edad, String direccion, double sueldo) {
		super(nombre, genero, edad, direccion);
		idEmpleado++;
		this.sueldo = sueldo;
	}

	public int getIdEmpleado() {
		return idEmpleado;
	}

	public double getSueldo() {
		return sueldo;
	}
	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}
}
