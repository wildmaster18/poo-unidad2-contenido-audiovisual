package uni1a;

import java.util.List;

public class ShowDeComedia extends ContenidoAudiovisual {
	private final List<Actor> comediantes; // Asociación 1..*
	private final int temporada;

	public ShowDeComedia(String titulo, int duracionEnMinutos, String genero, List<Actor> comediantes, int temporada) {
		super(titulo, duracionEnMinutos, genero);
		this.comediantes = comediantes;
		this.temporada = temporada;
	}

	@Override
	public void mostrarDetalles() {
		System.out.println("Detalles del show de comedia:");
		System.out.println("  ID: " + getId());
		System.out.println("  Título: " + getTitulo());
		System.out.println("  Duración: " + getDuracionEnMinutos() + " min");
		System.out.println("  Género: " + getGenero());
		System.out.println("  Temporada: " + temporada);
		System.out.print("  Comediantes: ");
		for (Actor a : comediantes) {
			System.out.print(a.getNombreCompleto() + "; ");
		}
		System.out.println("\n");
	}
}
