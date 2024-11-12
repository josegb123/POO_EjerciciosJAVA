package Ejercicio2_11;

public class Caja {

    double base;
    double ancho;
    double altura;
    String tipo;

    public Caja(double base, double ancho, double altura) {
        this.base = base;
        this.ancho = ancho;
        this.altura = altura;
    }

    public Caja() {
        this.base = 0.0;
        this.ancho = 0.0;
        this.altura = 0.0;
    }

    public Caja(double longitud) {
        this.base = longitud;
        this.ancho = longitud;
        this.altura = longitud;
    }

    public Caja(double base, double ancho, double altura, String tipo) {
        this(base, ancho, altura); //invocacion del primer constructor
        this.tipo = tipo;
    }

}
