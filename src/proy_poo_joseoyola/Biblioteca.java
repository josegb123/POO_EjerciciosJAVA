
package proy_poo_joseoyola;


public class Biblioteca {
    public static void main(String[] args) {
        // Creación de objetos (libros específicos)
        Libro libro1 = new Libro("Cien Años de Soledad", "Gabriel García Márquez", 1967);
        Libro libro2 = new Libro("1984", "George Orwell", 1949);

        // Uso de los métodos para mostrar la información de cada libro
        System.out.println("Información del Libro 1:");
        libro1.mostrarInfo();

        System.out.println("\nInformación del Libro 2:");
        libro2.mostrarInfo();
    }
}