
package proy_poo_joseoyola;


// Definición de la clase Libro
public class Libro {
    // Atributos de la clase (características)
    String titulo;
    String autor;
    int añoPublicacion;

    // Constructor para inicializar un objeto Libro
    Libro(String titulo, String autor, int añoPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.añoPublicacion = añoPublicacion;
    }

    // Método para mostrar información del libro
    void mostrarInfo() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Año de Publicación: " + añoPublicacion);
    }
}


