package TipoExamen.Coronavirus;

public abstract class Persona {
    // Variables
    private String nombre;
    private int edad;
    private char sexo;

    // Contructors
    public Persona(String nombre, int edad, char sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
    }

    // Getters and setters
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }

    public char getSexo() {
        return sexo;
    }
    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    // Metodos
    public void saludar(Persona persona) {
        System.out.println("Hola " + persona.getNombre());
    }

    // toString 
    @Override
    public String toString() {
        return 
        "Persona: " + this.nombre + " - " +
            this.edad + " - " +
            this.sexo + "."
        ;
    }
    
}
