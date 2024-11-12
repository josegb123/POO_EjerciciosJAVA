package Ejercicio2_07;

/**
 * Esta clase define objetos que representan una Pelicula. Una pelicula tiene un
 * nombre, un director, un tipo, una duracion, un año de estreno y una
 * calificacion realizada por los usuarios.
 *
 * @version 1.2/2020
 */
public class PeliculaV2 {
// Atributo que define el nombre de la pelicula

    private String nombre;
// Atributo que define el director de la pelicula
    private String director;
// Tipo de pelicula como un valor enumerado

    private enum tipo {
        ACCION, COMEDIA, DRAMA, SUSPENSO
    };
// Atributo que define el tipo de pelicula
    tipo genero;
// Atributo que define la duracion de la pelicula
    private int duracion;
// Atributo que define el año de estreno de la pelicula
    private int año;
// Atributo que define la calificacion de la pelicula por el publico
    private double calificacion;

    /**
     * Constructor de la clase Pelicula
     *
     * @param nombre Parametro que define el nombre o titulo de la pelicula
     * @param director Parametro que define el nombre completo del director de
     * la pelicula
     * @param genero Parametro que define el genero de la pelicula
     * @param duracion Parametro que define la duracion de una pelicula (en
     * minutos)
     * @param año Parametro que define el año de estreno de la pelicula
     * @param calificacion Parametro que define la calificacion de la pelicula
     * realizada por el publico
     */
    public PeliculaV2(String nombre, String director, tipo genero, int duracion, int año, double calificacion) {
        this.nombre = nombre;
        this.director = director;
        this.genero = genero;
        this.duracion = duracion;
        this.año = año;
        this.calificacion = calificacion;
    }

    /**
     * Metodo que devuelve el nombre de una pelicula
     *
     * @return El nombre de una pelicula
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Metodo que establece el nombre de una pelicula
     *
     * @param nombre Parametro que define el nombre de una pelicula
     */
    private void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Metodo que devuelve el director de una pelicula
     *
     * @return El director de una pelicula
     */
    public String getDirector() {
        return director;
    }

    /**
     * Metodo que establece el director de una pelicula
     *
     * @param director Parametro que define el director de una pelicula
     */
    private void setDirector(String director) {
        this.director = director;
    }

    /**
     * Metodo que devuelve el genero de una pelicula
     *
     * @return El genero de una pelicula
     */
    public tipo getGenero() {
        return genero;
    }

    /**
     * Metodo que establece el genero de una pelicula
     *
     * @param genero Parametro que define el genero de una pelicula
     */
    private void setGenero(tipo genero) {
        this.genero = genero;
    }

    /**
     * Metodo que devuelve la duracion de una pelicula
     *
     * @return La duracion de una pelicula
     */
    public int getDuracion() {
        return duracion;
    }

    /**
     * Metodo que establece la duracion de una pelicula
     *
     * @param duracion Parametro que define la duracion de una pelicula
     */
    private void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    /**
     * Metodo que devuelve el año de una pelicula
     *
     * @return El año de estreno de una pelicula
     */
    public int getAño() {
        return año;
    }

    /**
     * Metodo que establece el año de estreno de una pelicula
     *
     * @param año Parametro que define el año de una pelicula
     */
    private void setAño(int año) {
        this.año = año;
    }

    /**
     * Metodo que devuelve la calificacion de una pelicula
     *
     * @return La calificacion de una pelicula
     */
    public double getCalificacion() {
        return calificacion;
    }

    /**
     * Metodo que establece la calificacion de una pelicula
     *
     * @param calificacion Parametro que define la calificacion de una pelicula
     */
    private void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }

    /**
     * Metodo que imprime en pantalla los datos de una pelicula
     */
    public void imprimir() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Director: " + director);
        System.out.println("Genero: " + genero);
        System.out.println("Duracion: " + duracion);
        System.out.println("Año: " + año);
        System.out.println("Calificacion: " + calificacion
        );
    }

    /**
     * Metodo que determina si una pelicula se puede considerar como epica
     *
     * @return Valor booleano que determina si una pelicula es epica o no
     */
    private boolean esPeliculaEpica() {
        /* Una pelicula se considera epica si tiene una duracion igual o
superior a 180 minutos */
        if (duracion >= 180) {
            return true;
        } else {

            return false;
        }
    }

    /**
     * Metodo que determina la valoracion cualitativa de una pelicula
     *
     * @return Valoracion de una pelicula
     */
    private String calcularValoracion() {
        if (calificacion >= 0 && calificacion <= 2) {
            /* Entre [0, 2] se con-
sidera"Muy mala" */
            return "Muy mala";
        } else if (calificacion > 2 && calificacion <= 5) {
            /* Entre (2, 5] se
considera"Mala" */
            return "Mala";
        } else if (calificacion > 5 && calificacion <= 7) {
            /* Entre (5,7] se
considera"Regular" */
            return "Regular";
        } else if (calificacion > 7 && calificacion <= 8) {
            /* Entre (7,8] se
considera"Buena" */
            return "Buena";
        } else if (calificacion > 8 && calificacion <= 10) {
            /* Entre (8,10] se
considera"Excelente" */
            return "Excelente";
        } else {
            return "No tiene asignada una valoracion valida";
        }
    }

    /**
     * Metodo que determina si una pelicula es similar a otra
     *
     * @return Valor booleano que determina si una pelicula es similar a otra
     */
    private boolean esSimilar(PeliculaV2 pelicula) {
        /* Dos peliculas son similares si ambas son del mismo genero y si
tienen la misma valoracion */
        if (pelicula.genero == genero && pelicula.calcularValoracion()
                == calcularValoracion()) {
            return true;
        } else {
            return false;
        }

    }

    private String imprimirCartel() {

        // ancho de texto
        int ancho = 50;

        String cadena = "---------- " + getNombre() + " ----------\n";
                cadena += calcularClasificacion();

        cadena += "";
        cadena += " " + getAño() + "\n";
        cadena += getGenero() + "\n";
        cadena += getDirector() + "\n";
        // crear objeto donde se almacenaran las cadenas centradas
        StringBuilder cartelCentrado = new StringBuilder();
        //dividir la cadena en lineas separadas por un retorno de carro
        String[] lineas = cadena.split("\n");
        //iterar sobbre el array lineas, donde cada linea se le agregara el ancho deseado usando el metodo centrar texto
        for (String linea : lineas) { //for-each loop. se usa para recorrer arrays sin modificar datos, solo procesarlos, uso > for (variable contadora : array) {acciones}
            cartelCentrado.append(centrarTexto(linea, ancho)).append("\n"); //llamar al metodo centrar y agregar un retorno al final de cada linea en el array
        }
        return cartelCentrado.toString(); //devolver el stringbuilder como cadena string
    }
    private String calcularClasificacion(){
        String cadena = "";
        for (int i = 0; i < Math.round(getCalificacion()); i++){
            cadena +="*";
            
        }
        cadena += "\n";
        return cadena;
    }

    private String centrarTexto(String texto, int ancho) {

        // Calcular el espacio a la izquierda
        int espacioIzquierdo = (ancho - texto.length()) / 2;

        // Asegurarse de que el espacio no sea negativo
        if (espacioIzquierdo < 0) {

            espacioIzquierdo = 0; // No se puede centrar si el texto es más largo que el ancho

        }
        // Imprimir el texto centrado con el metodo format de string
        return String.format("%" + espacioIzquierdo + "s%s", "", texto);
        //metodo string.format: 1formato+NdeVeces+tipoString+2formato tipoString, 1 formato(se rellena con espacios), 2 formato(depende de cuantos formatos se abran con %)

    }

    /**
     * Metodo main que crea dos peliculas, imprime sus datos en pantalla,
     * determina si son epicas y si son similares
     *
     * @param ags
     */
    public static void main(String ags[]) {
        PeliculaV2 pelicula1 = new PeliculaV2("Gandhi", "Richard Attenborough", tipo.DRAMA, 191, 1982, 8.3); //para asignar varios generos se debe usar un set y list, por eso mejor lo deje con un solo genero
        PeliculaV2 pelicula2 = new PeliculaV2("Thor", "Kenneth Branagh", tipo.ACCION, 115, 2011, 7.0);
        pelicula1.imprimir();
        System.out.println();
        pelicula2.imprimir();
        System.out.println("");
        System.out.println(pelicula1.imprimirCartel()); //primer cartel
        System.out.println();
        System.out.println("La pelicula " + pelicula2.getNombre() + " es epica : " + pelicula2.esPeliculaEpica());
        System.out.println("La pelicula " + pelicula1.getNombre() + " es epica : " + pelicula1.esPeliculaEpica());
        System.out.println("La pelicula " + pelicula1.getNombre() + " y la pelicula" + pelicula2.getNombre() + " son similares = " + pelicula1.esSimilar(pelicula2));
        System.out.println("");
        System.out.println(pelicula2.imprimirCartel()); //segundo cartel
    }

}
