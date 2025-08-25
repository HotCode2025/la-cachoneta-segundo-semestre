
public class EjercicioWhile01 {
    public static void main(String[] args) {

        
        inicio:
                for(var contando = 0 ; contando <7 ; contando++ ){     //Orden: Variable, condicion a cumplir y incremento y decremento
            if(contando % 2!= 0){
                 
                 continue inicio; //Vamos a la siguiente iteracion
            }
            System.out.println("contando = " + contando);
        }     
                
    }
    
}
