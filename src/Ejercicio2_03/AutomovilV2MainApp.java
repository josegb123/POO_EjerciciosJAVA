package Ejercicio2_03;

public class AutomovilV2MainApp {

    /**
     * Método main que crea un automóvil, imprime sus datos en pantalla y
     * realiza varios cambios en su velocidad
     *
     * @param args
     */
    public static void main(String args[]) {
        AutomovilV2 auto1 = new AutomovilV2("Ford", 2018, 3, AutomovilV2.tipoCom.DIESEL, AutomovilV2.tipoA.EJECUTIVO, 5, 6, 250, AutomovilV2.tipoColor.NEGRO);
        auto1.imprimir();
        auto1.setVelocidadActual(100);
        System.out.println("Velocidad actual = " + auto1.velocidadActual);
        auto1.acelerar(20);
        System.out.println("Velocidad actual = " + auto1.velocidadActual);
        auto1.desacelerar(50);
        System.out.println("Velocidad actual = " + auto1.velocidadActual);
        auto1.frenar();
        System.out.println("Velocidad actual = " + auto1.velocidadActual);
        auto1.acelerar(270);
        System.out.println("Velocidad actual = " + auto1.velocidadActual);
        auto1.desacelerar(100);
        System.out.println("Velocidad actual = " + auto1.velocidadActual);
        System.out.println("Numero de multas del auto = " + auto1.getMultas());
        System.out.println("El valor de las multas del auto = " + auto1.getValorMultas());
    }

}
