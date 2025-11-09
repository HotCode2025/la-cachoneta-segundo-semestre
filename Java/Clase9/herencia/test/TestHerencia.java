package herencia.test;
import java.util.Date;
import herencia.domain.Cliente;
import herencia.domain.Empleado;

public class TestHerencia {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Ariel", 57000.00);
        System.out.println("empleado1 = " + empleado1);

        Date fecha1 = new Date();

        Cliente cliente1 = new Cliente("Bety", 'F', 32, "9 de Julio 1413", fecha1, true);
        System.out.println("cliente1 = " + cliente1);

    }
}
