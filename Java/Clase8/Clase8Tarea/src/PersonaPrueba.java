import Clases.Persona;

public class PersonaPrueba {
	public static void main(String[] args) {
		Persona persona1 = new Persona("Osvaldo",57000, false);
		persona1.setNombre("Marcos");
		System.out.println("el nombre modificado de persona1: " + persona1.getNombre());
		System.out.println("el sueldo de persona1: $" + persona1.getSueldo());
		System.out.println("Obtengo booleano de persona1: " + persona1.isEliminado());

		/*
		Tarea: Crear otro objeto de tipo Persona, asignar valores de manera inicial
		e imprimir, luego modificar sus valores y volver a imprimir
		 */
		Persona persona2 = new Persona("Santi",80500.10, true);

		// Imprimo en pantalla los datos del nuevo objeto persona2
		System.out.println("el nombre de persona2: " + persona2.getNombre());
		System.out.println("el sueldo de persona2: $" + persona2.getSueldo());
		System.out.println("Obtengo booleano de persona2: " + persona1.isEliminado());

		// Modifico los datos de persona2
		persona2.setNombre("Santiago"); // Arreglo el nombre ya que antes decia "Santi" nada mas
		persona2.setSueldo(90250.5);
		persona2.setEliminado(false);

		// Imprimo los datos modificados de persona 2
		System.out.println("el nombre arreglado de persona2: " + persona2.getNombre());
		System.out.println("el sueldo modificado de persona2: $" + persona2.getSueldo());
		System.out.println("Obtengo booleano de persona2 modificado: " + persona1.isEliminado());

	}
}