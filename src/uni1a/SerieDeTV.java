package uni1a;

import java.util.List;

public class SerieDeTV extends ContenidoAudiovisual {
    private final List<Temporada> temporadas;

    public SerieDeTV(String titulo, int duracionEnMinutos, String genero,
                     List<Temporada> temporadas) {
        super(titulo, duracionEnMinutos, genero);
        this.temporadas = temporadas;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Detalles de la serie de TV:");
        System.out.println("  ID: " + getId());
        System.out.println("  Título: " + getTitulo());
        System.out.println("  Duración: " + getDuracionEnMinutos() + " min");
        System.out.println("  Género: " + getGenero());
        System.out.print  ("  Temporadas: ");
        for (Temporada t : temporadas) {
            System.out.print(t.getNumero() + " ");
        }
        System.out.println("\n");
    }
}
