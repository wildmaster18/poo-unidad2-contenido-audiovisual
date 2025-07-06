package uni1a;

// Un Actor existe por sí mismo; luego lo asociaremos a una Pelicula
public class Actor {
    private String nombre;
    private String apellido;

    // Constructor: inicializa nombre y apellido
    public Actor(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String getNombre()  { return nombre; }
    public String getApellido(){ return apellido; }

    // Devuelve el nombre completo
    public String getNombreCompleto() {
        return nombre + " " + apellido;
    }
}
