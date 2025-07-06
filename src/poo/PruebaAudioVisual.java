package poo;

import uni1a.*;
import java.util.Arrays;
import java.util.List;

public class PruebaAudioVisual {
    public static void main(String[] args) {
        System.out.println("=== INICIO DE PRUEBA AUDIOVISUAL ===\n");

        // 1) Declara y crea el arreglo ampliado a 5 elementos
        ContenidoAudiovisual[] contenidos = new ContenidoAudiovisual[5];

        // 2) Película de ejemplo
        List<Actor> elencoPelicula = Arrays.asList(
            new Actor("Leonardo", "DiCaprio"),
            new Actor("Zoe",       "Saldana")
        );
        contenidos[0] = new Pelicula(
            "Avatar", 125, "Acción",
            "20th Century Studios",
            elencoPelicula
        );

        // 3) Serie de TV de ejemplo
        List<Temporada> temporadasGoT = Arrays.asList(
            new Temporada(1),
            new Temporada(2)
        );
        // Añadimos un episodio de muestra
        temporadasGoT.get(0).addEpisodio("Winter Is Coming");
        contenidos[1] = new SerieDeTV(
            "Game of Thrones", 60, "Fantasía",
            temporadasGoT
        );

        // 4) Documental de ejemplo
        Investigador sagan = new Investigador("Carl Sagan", "Astronomía");
        contenidos[2] = new Documental(
            "Cosmos", 45, "Ciencia",
            sagan
        );

        // 5) Show de comedia de ejemplo
        List<Actor> comediantes = Arrays.asList(
            new Actor("Franco", "Escamilla")
        );
        contenidos[3] = new ShowDeComedia(
            "Show Payaso", 90, "Comedia",
            comediantes,
            1  // temporada
        );

        // 6) Show de cocina de ejemplo
        List<Actor> invitadosCocina = Arrays.asList(
            new Actor("Alejandro",    "Chamorro")
        );
        contenidos[4] = new ShowDeCocina(
            "Master Chef", 60, "Cocina",
            "Gordon Ramsay",          // chef
            "Pasta de Maduro",         // receta
            30,                       // duración preparación
            invitadosCocina
        );

        // 7) Mostrar detalles de todos los contenidos
        for (ContenidoAudiovisual c : contenidos) {
            c.mostrarDetalles();
        }

        System.out.println("=== FIN DE PRUEBA AUDIOVISUAL ===");
    }
}