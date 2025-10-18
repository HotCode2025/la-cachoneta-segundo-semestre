package contextoStatico.domain;

public class Persona {
    
    //cargamos los atributos
    private int idPersona;
    private static int contadorPersonas;
    private String nombre;
    
    //constructor
    public Persona(String nombre){
        this.nombre = nombre;
        // incrementar el contador por cada objeto nuevo
        Persona.contadorPersonas++; // no utilizar el operador this
        // vamos a asignar un nuevo valor a la variable idPersona
        this.idPersona = Persona.contadorPersonas;
    }
    
    public static int getContadorPersona() {
        return contadorPersonas;
    }

    public static void setContadorPersona(int aContadorPersona) {
        contadorPersonas = aContadorPersona;
    }

    //metodos get
    public int getIdPersona() {
        return this.idPersona;       
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Persona [idPersona=" + idPersona + ", nombre=" + nombre + "]";
    }

}

/* Faltan ultimos 2 videos de la clase 8  */