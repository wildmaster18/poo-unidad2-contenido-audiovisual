package uni1a;

public class Documental extends ContenidoAudiovisual {
    private final Investigador investigador;

    public Documental(String titulo, int duracionEnMinutos, String genero,
                      Investigador investigador) {
        super(titulo, duracionEnMinutos, genero);
        this.investigador = investigador;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Detalles del documental:");
        System.out.println("  ID: " + getId());
        System.out.println("  Título: " + getTitulo());
        System.out.println("  Duración: " + getDuracionEnMinutos() + " min");
        System.out.println("  Género: " + getGenero());
        System.out.println("  Investigador: " + investigador.getNombre());
        System.out.println("  Especialidad: " + investigador.getEspecialidad());
        System.out.println();
    }
}
