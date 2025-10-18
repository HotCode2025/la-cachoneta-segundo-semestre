package Operaciones;

public class Aritmetica {
    // atributos de la clase
    int a;
    int b;
    
    // metodo 

    public void sumarNumeros (){
        int resultado = a + b;
        System.out.println("resultado: " + resultado);
    }

    public int sumarConRetorno (){
        //int resultado = a + b;
        return this.a + this.b;
    }

    public int sumarConArgumentos (int a, int b){
        this.a = a; // el argumento a se asigna al atributo a
        this.b = b;
        //return sumarConRetorno();
        return this.sumarConRetorno();
    }
}
