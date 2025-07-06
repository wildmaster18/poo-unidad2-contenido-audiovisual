# POO – Tarea Unidad 2: Contenido Audiovisual

## Descripción
Este proyecto implementa un sistema de **Contenido Audiovisual** en Java utilizando Programación Orientada a Objetos. Modela películas, series, documentales y dos nuevos tipos de contenido: shows de comedia y shows de cocina, mostrando sus detalles en consola.

## Objetivos y propósito
- Practicar herencia, polimorfismo y encapsulamiento.  
- Aplicar relaciones UML de herencia, asociación, agregación y composición.  
- Extender el modelo con nuevas subclases sin modificar las existentes.

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


