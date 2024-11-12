package Ejercicio2_04;

/**
 * Esta clase prueba diferentes acciones realizadas en diversas figuras
 * geometricas.
 *
 * @version 1.2/2020
 */
public class PruebaFiguras {

    /**
     * Metodo main que crea un circulo, un rectangulo, un cuadrado y un
     * triangulo rectangulo. Para cada uno de estas figuras geometricas, se
     * calcula su area y perimetro.
     *
     * @param args
     */
    public static void main(String args[]) {
        Circulo figura1 = new Circulo(2);
        Rectangulo figura2 = new Rectangulo(1, 2);
        Cuadrado figura3 = new Cuadrado(3);
        TrianguloRectangulo figura4 = new TrianguloRectangulo(3, 5);
        System.out.println("El area del circulo es = " + figura1.calcularArea());
        System.out.println("El perimetro del circulo es = " + figura1.calcularPerimetro());
        System.out.println();
        System.out.println("El area del rectangulo es = " + figura2.calcularArea());
        System.out.println("El perimetro del rectangulo es = " + figura2.calcularPerimetro());
        System.out.println();
        System.out.println("El area del cuadrado es = " + figura3.calcularArea());
        System.out.println("El perimetro del cuadrado es = " + figura3.calcularPerimetro());
        System.out.println();
        System.out.println("El area del triangulo es = " + figura4.calcularArea());
        System.out.println("El perimetro del triangulo es = " + figura4.calcularPerimetro());
        figura4.determinarTipoTriangulo();
        System.out.println();
        
        
        
        //prueba ejercicio
        Rombo rombo = new Rombo(10, 6);
        System.out.println("Area del rombo: " + rombo.calcularArea());
        System.out.println("Perimetro del rombo: " + rombo.calcularPerimetro());
        System.out.println();
        
        Rombo rombo2 = new Rombo(10, 6, 4);
        System.out.println("Area del rombo: " + rombo2.calcularArea());
        System.out.println("Perimetro del rombo: " + rombo2.calcularPerimetro());
        System.out.println();
        
        Trapecio trapecio = new Trapecio(10, 6, 5, 4, 3);
        System.out.println("Area del trapecio: " + trapecio.calcularArea());
        System.out.println("Perimetro del trapecio: " + trapecio.calcularPerimetro());
    }
}
