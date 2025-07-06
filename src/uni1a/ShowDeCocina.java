package uni1a;

import java.util.List;

public class ShowDeCocina extends ContenidoAudiovisual {
	private final String chef;
	private final String receta;
	private final int duracionPreparacion;
	private final List<Actor> invitados; // Asociación 1..*

	public ShowDeCocina(String titulo, int duracionEnMinutos, String genero, String chef, String receta,
			int duracionPreparacion, List<Actor> invitados) {
		super(titulo, duracionEnMinutos, genero);
		this.chef = chef;
		this.receta = receta;
		this.duracionPreparacion = duracionPreparacion;
		this.invitados = invitados;
	}

	@Override
	public void mostrarDetalles() {
		System.out.println("Detalles del show de cocina:");
		System.out.println("  ID: " + getId());
		System.out.println("  Título: " + getTitulo());
		System.out.println("  Duración: " + getDuracionEnMinutos() + " min");
		System.out.println("  Género: " + getGenero());
		System.out.println("  Chef: " + chef);
		System.out.println("  Receta: " + receta);
		System.out.println("  Preparación: " + duracionPreparacion + " min");
		System.out.print("  Invitados: ");
		for (Actor a : invitados) {
			System.out.print(a.getNombreCompleto() + "; ");
		}
		System.out.println("\n");
	}
}
