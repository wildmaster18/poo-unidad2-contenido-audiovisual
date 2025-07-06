package uni1a;

public abstract class ContenidoAudiovisual {
public static int contar = 0;
    private final int id;
    private final String titulo;
    private final int duracionEnMinutos;
    private final String genero;

    public ContenidoAudiovisual(String titulo, int duracionEnMinutos, String genero) {
        this.id = contar++;
        this.titulo = titulo;
        this.duracionEnMinutos = duracionEnMinutos;
        this.genero = genero;
    }

    public int getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getDuracionEnMinutos() {
        return duracionEnMinutos;
    }

    public String getGenero() {
        return genero;
    }

    public abstract void mostrarDetalles();
}
