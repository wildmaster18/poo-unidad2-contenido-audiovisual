package uni1a;

// El Investigador formará parte intrínseca de Documental
public class Investigador {
    private String nombre;
    private String especialidad;

    public Investigador(String nombre, String especialidad) {
        this.nombre = nombre;
        this.especialidad = especialidad;
    }

    public String getNombre() {
        return nombre;
    }
    public String getEspecialidad() {
        return especialidad;
    }
}
