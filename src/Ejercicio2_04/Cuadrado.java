
package Ejercicio2_04;



/**
 * Esta clase define objetos de tipo Cuadrado con un lado como atributo.
 *
 * @version 1.2/2020
 */
public class Cuadrado {

    int lado; // Atributo que define el lado de un cuadrado

    /**
     * Constructor de la clase Cuadrado
     *
     * @param lado Parametro que define la longitud de la base de un cuadrado
     */
    public Cuadrado(int lado) {
        this.lado = lado;
    }

    /**
     * Método que calcula y devuelve el area de un cuadrado como el lado elevado
     * al cuadrado
     *
     * @return Área de un Cuadrado
     */
    double calcularArea() {
        return lado * lado;
    }

    /**
     * Método que calcula y devuelve el perimetro de un cuadrado como cuatro
     * veces su lado
     *
     * @return Perimetro de un cuadrado
     */
    double calcularPerimetro() {
        return (4 * lado);
    }
}

/**
 * Esta clase define objetos de tipo Triangulo Rectangulo con una base y una
 * altura como atributos.
 *
 * @version 1.2/2020
 */
