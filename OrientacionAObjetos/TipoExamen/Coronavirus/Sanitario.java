package TipoExamen.Coronavirus;

public class Sanitario extends Persona {
    // Variables
    private String categoria;

    // Constructor
    public Sanitario(String nombre, int edad, char sexo, String categoria) {
        super(nombre, edad, sexo);
        this.categoria = categoria;
    }

    // Getters and setters
    public String getCategoria() {
        return categoria;
    }
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    
    // Metodos
    public void diagnosticar(Paciente persona) {
        boolean curable = false;

        for(Enfermedad e : persona.getEnfermedades()) {
            if(e.getCodigo() == 1) {
                curable = false;
                System.out.println(persona.getNombre() + ", te has contagiado de Coronavirus");
            } else if (e.getCodigo() == 2) {
                curable = true;
                System.out.println(persona.getNombre() + ", te has contagiado de Resfriado");
            } else if (e.getCodigo() == 3) {
                curable = true;
                System.out.println(persona.getNombre() + ", te has contagiado de Gripe");
            } 
        }
    }
    
    public void saludar(Persona persona) {
        System.out.println("Hola soy " + persona.getNombre());
    }

    public void curar(Paciente persona, Enfermedad enfermedad) {
            if (enfermedad.isCurable()) {
                if(persona.getEnfermedades().contains(enfermedad)) {
                    persona.getEnfermedades().remove(enfermedad);

                    if (enfermedad.getCodigo() == 1) {
                        System.out.print (persona.getNombre() + " no te puedes curar de Coronavirus. \n");

                    } else if (enfermedad.getCodigo() == 2) {
                        System.out.print (persona.getNombre() + " te has curado de un Resfriado. \n");

                    } else {
                        System.out.print (persona.getNombre() + " te has curado de Gripe. \n");
                    }
                }
            }  else {
                persona.getEnfermedades();
            } 
        
    }

    public void Saludar(Sanitario persona) {
        System.out.println("Hola " + persona.getNombre());
    }

    // toString
    @Override
    public String toString() {
        return 
        "Sanitario: " + this.categoria + " - " +
        super.getNombre() + " - " +
        super.getEdad() + " - " +
        super.getSexo() + ". " 
        ;
    }
}
