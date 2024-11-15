package Ejercicio2_02;

/**
 * Esta clase define objetos de tipo Planeta con un nombre, cantidad de
 * satélites, masa, volumen, diámetro, distancia al sol, tipo de planeta y si es
 * observable o no.
 *
 * @version 1.2/2020
 *
 */
public class PlanetaV2 {
// Atributo que define el nombre de un planeta

    String nombre = null;
// Atributo que define la cantidad de satélites que tiene un planeta
    int cantidadSatélites = 0;
// Atributo que define la masa de un planeta
    double masa = 0;
// Atributo que define el volumen de un planeta
    double volumen = 0;
// Atributo que define el diámetro de un planeta
    int diámetro = 0;
// Atributo que define la distancia al sol de un planeta
    int distanciaSol = 0;
// Atributo que define el tipo de planeta como un valor enumerado
    double periodoOrbital = 0;
    
    int periodoRotacion = 0;

    enum tipoPlaneta {
        GASEOSO, TERRESTRE, ENANO
    }
// Atributo que define el tipo de planeta
    tipoPlaneta tipo;
// Atributo que define si el planeta es observable o no
    boolean esObservable = false;

    /**
     * Constructor de la clase Planeta
     *
     * @param nombre Parámetro que define el nombre del planeta
     * @param cantidadSatélites Parámetro que define la cantidad de satélites
     * del planeta
     * @param masa Parámetro que define la masa del planeta (en kilogramos)
     * @param volumen Parámetro que define el volumen del planeta (en kilómetros
     * cúbicos)
     * @param diámetro Parámetro que define el diámetro del planeta (en
     * kilómetros) 70 Ejercicios de programación orientada a objetos con Java y
     * UML
     * @param distanciaSol Parámetro que define la distancia media del planeta
     * al sol (en kilómetros)
     * @param tipo Parámetro que define el tipo de planeta (puede ser GASEOSO,
     * TERRESTRE o ENANO)
     * @param esObservable Parámetro que define si el planeta es observable o no
     */
    PlanetaV2(String nombre, int cantidadSatélites, double masa, double volumen, int diámetro, int distanciaSol, tipoPlaneta tipo, boolean esObservable) {
        this.nombre = nombre;
        this.cantidadSatélites = cantidadSatélites;
        this.masa = masa;
        this.volumen = volumen;
        this.diámetro = diámetro;
        this.distanciaSol = distanciaSol;
        this.tipo = tipo;
        this.esObservable = esObservable;
    }
        PlanetaV2(String nombre, int cantidadSatélites, double masa, double volumen, int diámetro, int distanciaSol,double periodoOrbital, int periodoRotacion, tipoPlaneta tipo, boolean esObservable) {
        this.nombre = nombre;
        this.cantidadSatélites = cantidadSatélites;
        this.masa = masa;
        this.volumen = volumen;
        this.diámetro = diámetro;
        this.distanciaSol = distanciaSol;
        this.periodoOrbital = periodoOrbital;
        this.periodoRotacion = periodoRotacion;
        this.tipo = tipo;
        this.esObservable = esObservable;
    }

//Método que imprime en pantalla los datos de un planeta
    void imprimir() {
        System.out.println("Nombre del planeta = " + nombre);
        System.out.println("Cantidad de satélites = " + cantidadSatélites);
        System.out.println("Masa del planeta = " + masa);
        System.out.println("Volumen del planeta = " + volumen);
        System.out.println("Diámetro del planeta = " + diámetro);
        System.out.println("Distancia al sol = " + distanciaSol);
        System.out.println("Periodo Orbital(años) = " + periodoOrbital);
        System.out.println("Periodo Rotacion(dias) = " + periodoRotacion);
        System.out.println("Tipo de planeta = " + tipo);
        System.out.println("Es observable = " + esObservable);
    }

    /**
     * Método que calcula y devuelve la densidad de un planeta
     *
     * @return La densidad calculada del planeta
     */
    double calcularDensidad() {
        return masa / volumen;
    }

    /**
     * Método que determina y devuelve si un planeta es exterior o no
     *
     * @return Valor booleano que indica si el planeta es exterior o no
     */
    boolean esPlanetaExterior() {
        float límite = (float) (149597870 * 3.4);
        /* Un planeta exterior está situado más allá del cinturón de
asteroides */
 /* El cinturón se encuentra entre 2,1 y 3,4 UA (UA =
149.597.870 Km) */
        if (distanciaSol > límite) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Método main que crea dos planetas, imprime sus datos en pantalla,
     * determina su densidad y si son planetas exteriores
     *
     */
}
