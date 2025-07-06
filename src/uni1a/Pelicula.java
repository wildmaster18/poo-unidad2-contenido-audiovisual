package uni1a;

import java.util.List;

public class Pelicula extends ContenidoAudiovisual {
    private final String estudio;
    private final List<Actor> actores;

    public Pelicula(String titulo, int duracionEnMinutos, String genero,
                    String estudio, List<Actor> actores) {
        super(titulo, duracionEnMinutos, genero);
        this.estudio = estudio;
        this.actores = actores;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Detalles de la película:");
        System.out.println("  ID: " + getId());
        System.out.println("  Título: " + getTitulo());
        System.out.println("  Duración: " + getDuracionEnMinutos() + " min");
        System.out.println("  Género: " + getGenero());
        System.out.println("  Estudio: " + estudio);
        System.out.print  ("  Actores: ");
        for (Actor a : actores) {
            System.out.print(a.getNombreCompleto() + "; ");
        }
        System.out.println("\n");
    }
}
