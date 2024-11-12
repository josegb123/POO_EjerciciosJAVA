package Ejercicio2_11;

/**
 * Esta clase define objetos de tipo ArticuloCientifico con un titulo, autor,
 * tres palabras clave, año de publicacion y un resumen.
 *
 * @version 1.2/2020
 */
public class ArticuloCientifico {

    String titulo; // Atributo que define el titulo de un articulo cientifico
    String autor; // Atributo que define el autor de un articulo cientifico
// Atributo que define las palabras clave de un articulo cientifico
    String[] palabrasClaves = new String[3];
    String publicacion;
    /* Atributo que define la publicacion que incluye
el articulo cientifico */
    int año;
    /* Atributo que define el año de publicacion de un articulo
cientifico */
    String resumen;

    /* Atributo que define el resumen de un articulo
cientifico */
    /**
     * Constructor de la clase ArticuloCientifico
     *
     * @param titulo Parametro que define el titulo del articulo cientifico
     * @param autor Parametro que define el autor del articulo cientifico
     */
    public ArticuloCientifico(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    /**
     * Constructor sobrecargado de la clase ArticuloCientifico
     *
     * @param titulo Parametro que define el titulo del articulo cientifico
     * @param autor Parametro que define el autor del articulo cientifico
     * @param palabrasClaves Parametro que define un listado de palabras clave
     * para el articulo cientifico
     * @param publicacion Parametro que define el nombre de la publicacion a la
     * que pertenece el articulo cientifico
     * @param año Parametro que define el año de publicacion del articulo
     * cientifico
     */

    public ArticuloCientifico(String titulo, String autor, String[] palabrasClaves, String publicacion, int año) {
        this(titulo, autor); // Invoca al constructor sobrecargado
        this.palabrasClaves = palabrasClaves;
        this.publicacion = publicacion;
        this.año = año;
    }

    /**
     * Constructor sobrecargado de la clase ArticuloCientifico
     *
     * @param titulo Parametro que define el titulo del articulo cientifico
     * @param autor Parametro que define el autor del articulo cientifico
     * @param palabrasClaves Parametro que define un listado de palabras clave
     * para el articulo cientifico
     * @param publicacion Parametro que define el nombre de la publicacion a la
     * que pertenece el articulo cientifico
     * @param año Parametro que define el año de publicacion del articulo
     * cientifico
     * @param resumen Parametro que define el resumen del articulo cientifico
     */
    public ArticuloCientifico(String titulo, String autor, String[] palabrasClaves, String publicacion, int año, String resumen) {
        this(titulo, autor, palabrasClaves, publicacion, año);
        /* Invoca al
constructor sobrecargado */
        this.resumen = resumen;
    }

    /**
     * Metodo que imprime en pantalla los datos de un articulo cientifico
     */
    public void imprimir() {
        System.out.println("Titulo del articulo =  " + titulo);
        System.out.println("Autor del articulo =  " + autor);
        System.out.println("Palabras clave =  ");
// Recorre el array para imprimir cada palabra clave
        for (int i = 0; i < palabrasClaves.length; i++) {
            System.out.println(palabrasClaves[i]);
        }
        System.out.println("Publicacion =  " + publicacion);
        System.out.println("Año =  " + año);
        System.out.println("Resumen =  " + resumen);
    }

}
