import Classes.*;

import java.util.Date;

public class Main {
	public static void main(String[] args) {
		// Voy a crear unos objetos de las clases Persona, Empleado y Cliente

		// Creo persona1 de la clase Persona
		Persona persona1 = new Persona("Agustín", 'M', 21, "Alberdi 233");
		// Muestro en pantalla los datos del objeto persona1
		System.out.println("Muestro todo lo referido al objeto persona1");
		System.out.println("Nombre: " + persona1.getNombre());
		System.out.println("Genero: " + persona1.getGenero());
		System.out.println("Edad: " + persona1.getEdad());
		System.out.println("Dirección: " + persona1.getDireccion());
		// Modifico los datos del objeto persona1
		persona1.setNombre("Jimena");
		persona1.setGenero('F');
		persona1.setEdad(29);
		persona1.setDireccion("San Luis 523");
		// Muestro en pantalla los datos modificados del objeto persona1
		System.out.println("Nombre modificado: " + persona1.getNombre());
		System.out.println("Genero modificado: " + persona1.getGenero());
		System.out.println("Edad modificado: " + persona1.getEdad());
		System.out.println("Dirección modificado: " + persona1.getDireccion());


		// Creo empleado1 de la clase Empleado
		Empleado empleado1 = new Empleado("Sandra", 'F', 30, "Gral Armando 423", 3221.5);
		// Muestro en pantalla los datos del objeto empleado1
		System.out.println("");
		System.out.println("Muestro todo lo referido al objeto empleado1");
		System.out.println("Nombre: " + empleado1.getNombre());
		System.out.println("Genero: " + empleado1.getGenero());
		System.out.println("Edad: " + empleado1.getEdad());
		System.out.println("Dirección: " + empleado1.getDireccion());
		System.out.println("Id: " + empleado1.getIdEmpleado());
		System.out.println("Sueldo: $" + empleado1.getSueldo());
		// Modifico los datos del objeto empleado1
		empleado1.setNombre("Roberto");
		empleado1.setGenero('M');
		empleado1.setEdad(23);
		empleado1.setDireccion("Alberdi 421");
		empleado1.setSueldo(2540.2);
		// Muestro en pantalla los datos modificados del objeto empleado1
		System.out.println("Nombre modificado: " + empleado1.getNombre());
		System.out.println("Genero modificado: " + empleado1.getGenero());
		System.out.println("Edad modificado: " + empleado1.getEdad());
		System.out.println("Dirección modificado: " + empleado1.getDireccion());
		System.out.println("Sueldo modificado: $" + empleado1.getSueldo());
		// Creo otro objeto empleado para mostrar como el cada objeto tiene un id diferente a la hora de crearse
		Empleado empleado2 = new Empleado("Roman", 'M', 35, "Gral Armando 213", 5050.2);
		System.out.println("Id de empleado2: " + empleado2.getIdEmpleado());


		// Creo un objeto Date para usar al crear cliente1 de la clase Cliente
		Date fecha1 = new Date(2023,3,23);
		Cliente cliente1 = new Cliente("Armando", 'M', 45, "Gral Sarmiento 2321", fecha1, true);
		// Muestro en pantalla los datos del objeto cliente1
		System.out.println("");
		System.out.println("Muestro todo lo referido al objeto cliente1");
		System.out.println("Nombre: " + cliente1.getNombre());
		System.out.println("Genero: " + cliente1.getGenero());
		System.out.println("Edad: " + cliente1.getEdad());
		System.out.println("Dirección: " + cliente1.getDireccion());
		System.out.println("Fecha de registro: " + cliente1.getFechaRegistro());
		System.out.println("¿Es vip?: " + cliente1.isVip());
		System.out.println("Id: " + cliente1.getIdCliente());
		// Modifico los datos del objeto cliente1
		cliente1.setNombre("Francisca");
		cliente1.setGenero('F');
		cliente1.setEdad(21);
		cliente1.setDireccion("Einstein 4123");
		Date fecha2 = new Date(2024,12,3);
		cliente1.setFechaRegistro(fecha2);
		cliente1.setVip(false);
		// Muestro en pantalla los datos modificados del objeto cliente1
		System.out.println("Nombre modificado: " + cliente1.getNombre());
		System.out.println("Genero modificado: " + cliente1.getGenero());
		System.out.println("Edad modificado: " + cliente1.getEdad());
		System.out.println("Dirección modificado: " + cliente1.getDireccion());
		System.out.println("Fecha de registro modificado: " + cliente1.getFechaRegistro());
		System.out.println("¿Es vip? modificado: " + cliente1.isVip());
		// Creo otro objeto empleado para mostrar como el cada objeto tiene un id diferente a la hora de crearse
		Cliente cliente2 = new Cliente("Roman", 'M', 35, "Gral Armando 213", fecha1, false);
		System.out.println("Id de cliente2: " + cliente2.getIdCliente());



	}
}