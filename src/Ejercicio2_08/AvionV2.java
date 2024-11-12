package Ejercicio2_08;

/**
 * Esta clase define objetos de tipo Avion con un fabricante y numero de motores
 * como atributos.
 *
 * @version 1.2/2020
 */
public class AvionV2 {

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
    private AvionV2(String fabricante, int numeroMotores) {
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
    private void cambiarFabricante(AvionV2 a) {
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
        AvionV2 a1 = new AvionV2("Airbus ", 4);
        AvionV2 a2;
        AvionV2 a3 = new AvionV2("Boeing ", 4);
        a2 = a1;
        a1.imprimirFabricante();
        a2.imprimirFabricante();
        a1.setFabricante("Douglas ");
        a1.imprimirFabricante();
        a2.imprimirFabricante();
        a1.cambiarFabricante(a2);
        a2.imprimirFabricante();
        System.out.println("");

        //Prueba ejercicio
        AvionV2 avion1 = new AvionV2("Bombardier", 3);
        AvionV2 avion2 = new AvionV2("Embraer", 3);

        avion2 = avion1; //asignar el primero al segundo, es decir, tomar el contenido del primero y asignarlo al segundo

        avion1.imprimirFabricante(); //imprimir atributos
        avion2.imprimirFabricante();

        avion2.setFabricante("Stealth"); //Asignar "Stealth" al fabricante del segundo objeto
        System.out.println(avion1.getFabricante()); //mostrar el fabricante del primer objeto
        /**
         * Esta es la salida en pantalla: El fabricante del avion es: Bombardier
         * El fabricante del avion es: Bombardier Stealth
         */
    }
}
