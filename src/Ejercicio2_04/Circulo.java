package Ejercicio2_04;

/**
 * Esta clase define objetos de tipo Circulo con su radio como atributo.
 *
 * @version 1.2/2020
 */
public class Circulo {

    int radio; // Atributo que define el radio de un circulo

    /**
     * Constructor de la clase Circulo
     *
     * @param radio Parametro que define el radio de un circulo
     */
    Circulo(int radio) {
        this.radio = radio;
    }

    /**
     * Método que calcula y devuelve el area de un circulo como pi multiplicado
     * por el radio al cuadrado
     *
     * @return Área de un circulo
     */
    double calcularArea() {
        return Math.PI * Math.pow(radio, 2);
    }

    /**
     * Método que calcula y devuelve el perimetro de un circulo como la
     * multiplicacion de pi por el radio por 2
     *
     * @return Perimetro de un circulo
     */
    double calcularPerimetro() {
        return 2 * Math.PI * radio;
    }
}


