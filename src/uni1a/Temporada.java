package uni1a;

import java.util.ArrayList;
import java.util.List;

// Una Temporada existe por sí misma, luego la agregaremos a una SerieDeTV
public class Temporada {
    private int numero;
    private List<String> episodios;

    public Temporada(int numero) {
        this.numero = numero;
        this.episodios = new ArrayList<>();
    }

    public int getNumero() {
        return numero;
    }

    public void addEpisodio(String titulo) {
        episodios.add(titulo);
    }

    public List<String> getEpisodios() {
        return episodios;
    }
}
