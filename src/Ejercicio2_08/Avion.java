package Ejercicio2_08;

/**
 * Esta clase define objetos de tipo Avion con un fabricante y numero de motores
 * como atributos.
 *
 * @version 1.2/2020
 */
public class Avion {

    private String fabricante;
    /* Atributo que define el nombre del fabri-
cante del avion */
    private int numeroMotores;

    /* Atributo que define el numero de mo-
tores del avion */
    /**
     * Constructor de la clase Avion
     *
     * @param fabricante Parametro que define el nombre del fabricante de un
     * avion
     * @param numeroMotores Parametro que define el numero de motores que tiene
     * un avion 118 Ejercicios de programacion orientada a objetos con Java y
     * UML
     */
    private Avion(String fabricante, int numeroMotores) {
        this.fabricante = fabricante;
        this.numeroMotores = numeroMotores;
    }

    /**
     * Metodo que devuelve el nombre del fabricante de un avion
     *
     * @return El nombre del fabricante de un avion
     */
    public String getFabricante() {
        return fabricante;
    }

    /**
     * Metodo que establece el nombre de un fabricande de un avion
     *
     * @param fabricante Parametro que define el nombre del fabricante de un
     * avion
     */
    private void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    /**
     * Metodo que cambia el fabricante de un avion pasado como parametro por el
     * valor "Lockheed"
     *
     * @param a Parametro que define un avion
     */
    private void cambiarFabricante(Avion a) {
        a.setFabricante("Lockheed");
    }

    /**
     * Metodo que devuelve el numero de motores de un avion
     *
     * @return El numero de motores de un avion
     */
    public int getNumeroMotores() {
        return numeroMotores;
    }

    /**
     * Metodo que establece el numero de motores de un avion
     *
     * @param numeroMotores Parametro que define el numero de motores de un
     * avion
     */
    private void setNumeroMotores(int numeroMotores) {
        this.numeroMotores = numeroMotores;
    }

    /**
     * Metodo que imprime en pantalla el fabricante de un avion
     */
    public void imprimirFabricante() {
        System.out.println("El fabricante del avion es:  " + fabricante);
    }

    /**
     * Metodo main que crea dos aviones y modifica sus fabricantes
     */
    public static void main(String args[]) {
        Avion a1 = new Avion("Airbus ", 4);
        Avion a2;
        Avion a3 = new Avion("Boeing ", 4);
        a2 = a1;
        a1.imprimirFabricante();
        a2.imprimirFabricante();
        a1.setFabricante("Douglas ");
        a1.imprimirFabricante();
        a2.imprimirFabricante();
        a1.cambiarFabricante(a2);
        a2.imprimirFabricante();
        System.out.println("");

    }
}
