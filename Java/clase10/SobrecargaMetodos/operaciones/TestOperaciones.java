package SobrecargaMetodos.operaciones;

public class TestOperaciones {
    public static void main(String[] args) {
        int resultado = Operaciones.sumar(7, 9);
        System.out.println("resultado = " + resultado);

        double resultado2 = Operaciones.sumar(5.0, 7);
        System.out.println("resultado2 = " + resultado2);

        double resultado3 = Operaciones.sumar(8, 6L);
        System.out.println("resultado3 = " + resultado3);
    }
}
