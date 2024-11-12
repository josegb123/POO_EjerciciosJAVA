package Ejercicio2_09;

/**
 * Esta clase define objetos de tipo ConversorMetros el cual permite realizar
 * conversiones entre diferentes unidades de medicion de longitud.
 *
 * @version 1.2/2020
 */
public class ConversorMetros {

    /* Atributo que define la cantidad de metros a convertir a diferentes
unidades de longitud */
    double metros;
    final int FACTOR_METROS_CM = 100;
    /* Factor de conversion de
metros a centimetros */
    final int FACTOR_METROS_MILIM = 1000;
    /* Factor de conversion
de metros a milimetros */
    final double FACTOR_METROS_PULGADAS = 39.37;
    /* Factor de
conversion de metros a pulgadas */
    final double FACTOR_METROS_PIES = 3.28;
    /* Factor de
conversion de metros a pies */
    final double FACTOR_METROS_YARDAS = 1.09361;

    /* Factor de
conversion de metros a yardas */
    /**
     * Constructor de la clase ConversorMetros
     *
     * @param metros Parametro que define la cantidad de metros a convertir a
     * otras unidades de longitud
     */
    public ConversorMetros(double metros) {
        this.metros = metros;
    }

    /**
     * Metodo que convierte metros a centimetros
     *
     * @return Resultado de la conversion de metros a centimetros
     */
    public double convertirMetrosToCentimetros() {
        double centimetros;
        centimetros = FACTOR_METROS_CM * metros;
        return centimetros;
    }

    /**
     * Metodo que convierte metros a milimetros
     *
     * @return Resultado de la conversion de metros a milimetros
     */
    public double convertirMetrosToMilimetros() {
        double milimetros;
        milimetros = FACTOR_METROS_MILIM * metros;
        return milimetros;
    }

    /**
     * Metodo que convierte metros a pulgadas
     *
     * @return Resultado de la conversion de metros a pulgadas
     */
    public double convertirMetrosToPulgadas() {
        double pulgadas;
        pulgadas = FACTOR_METROS_PULGADAS * metros;
        return pulgadas;
    }

    /**
     * Metodo que convierte metros a pies
     *
     * @return Resultado de la conversion de metros a pies
     */
    public double convertirMetrosToPies() {
        double pies;
        pies = FACTOR_METROS_PIES * metros;
        return pies;
    }

    /**
     * Metodo que convierte metros a yardas
     *
     * @return Resultado de la conversion de metros a yardas
     */
    public double convertirMetrosToYardas() {
        double yardas;
        yardas = FACTOR_METROS_YARDAS * metros;
        return yardas;
    }

    /**
     * Metodo main que define una cierta cantidad de metros y los convierte a
     * diferentes unidades de longitud
     */
    public static void main(String args[]) {
        ConversorMetros conversor = new ConversorMetros(3.5);
        System.out.println("Metros =  " + conversor.metros);
        System.out.println("Metros a centimetros =  " + conversor.convertirMetrosToCentimetros());
        System.out.println("Metros a milimetros =  " + conversor.convertirMetrosToMilimetros());
        System.out.println("Metros a pulgadas =  " + conversor.convertirMetrosToPulgadas());
        System.out.println("Metros a pies =  " + conversor.convertirMetrosToPies());
        System.out.println("Metros a yardas =  " + conversor.convertirMetrosToYardas());
    }
}
