# POO – Tarea Unidad 2: Contenido Audiovisual

## Descripción
Este proyecto implementa un sistema de **Contenido Audiovisual** en Java utilizando Programación Orientada a Objetos. Modela películas, series, documentales y dos nuevos tipos de contenido: shows de comedia y shows de cocina, mostrando sus detalles en consola.

## Objetivos y propósito
- Practicar herencia, polimorfismo y encapsulamiento.  
- Aplicar relaciones UML de herencia, asociación, agregación y composición.  
- Extender el modelo con nuevas subclases sin modificar las existentes (principio Abierto/Cerrado).

## Clases y funcionalidades nuevas
- **ShowDeComedia**  
  - Hereda de `ContenidoAudiovisual`.  
  - Atributos: `List<Actor> comediantes`, `int temporada`.  
  - Asociación 1..* con `Actor`.  
  - Método `mostrarDetalles()` personalizado.  

- **ShowDeCocina**  
  - Hereda de `ContenidoAudiovisual`.  
  - Atributos: `String chef`, `String receta`, `int duracionPreparacion`, `List<Actor> invitados`.  
  - Asociación 1..* con `Actor`.  
  - Método `mostrarDetalles()` personalizado.  

Además de las subclases originales (`Pelicula`, `SerieDeTV`, `Documental`), el proyecto incluye:
- Formato alineado y separadores en la salida de `mostrarDetalles()`.  
- Clase `Actor`, `Investigador` y `Temporada` para representar asociaciones y composiciones.

## Cómo clonar y ejecutar

```bash
# 1. Clonar el repositorio
git clone https://github.com/tuUsuario/poo-unidad2-contenido-audiovisual.git
cd poo-unidad2-contenido-audiovisual

# 2. Compilar (Java 11+)
javac -d bin src/uni1a/*.java src/poo/*.java

# 3. Ejecutar
java -cp bin poo.PruebaAudioVisual
