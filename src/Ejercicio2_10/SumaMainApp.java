package Ejercicio2_10;

public class SumaMainApp {

    public static void main(String[] args) {
        Suma suma = new Suma();

        System.out.println("Suma de dos enteros (3 + 5): " + suma.sumar(3, 5));
        System.out.println("Suma de tres enteros (3 + 5 + 7): " + suma.sumar(3, 5, 7));
        System.out.println("Suma de dos doubles (3.5 + 2.5): " + suma.sumar(3.5, 2.5));
        System.out.println("Suma de tres doubles (1.1 + 2.2 + 3.3): " + suma.sumar(1.1, 2.2, 3.3));
    }

}
