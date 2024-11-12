
package Ejercicio2_03;


public class AutomovilMainApp {

    /**
     * Método main que crea un automóvil, imprime sus datos en pantalla y
     * realiza varios cambios en su velocidad
     * @param args
     */
    public static void main(String args[]) {
        Automovil auto1 = new Automovil("Ford", 2018, 3, Automovil.tipoCom.DIESEL, Automovil.tipoA.EJECUTIVO, 5, 6, 250, Automovil.tipoColor.NEGRO);
        auto1.imprimir();
        auto1.setVelocidadActual(100);
        System.out.println("Velocidad actual = " + auto1.velocidadActual);
        auto1.acelerar(20);
        System.out.println("Velocidad actual = " + auto1.velocidadActual);
        auto1.desacelerar(50);
        System.out.println("Velocidad actual = " + auto1.velocidadActual);
        auto1.frenar();
        System.out.println("Velocidad actual = " + auto1.velocidadActual);
        auto1.desacelerar(20);
    }

}
