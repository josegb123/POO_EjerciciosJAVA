
package Ejercicio2_02;


public class PlanetaV2MainApp {

    public static void main(String args[]) {
        PlanetaV2 p1 = new PlanetaV2("Tierra", 1, 5.9736E24, 1.08321E12, 12742, 150000000, 1.0, 1, PlanetaV2.tipoPlaneta.TERRESTRE, true);
        p1.imprimir();
        System.out.println("Densidad del planeta = "
                + p1.calcularDensidad());
        System.out.println("Es planeta exterior = "
                + p1.esPlanetaExterior());
        System.out.println();
        PlanetaV2 p2 = new PlanetaV2("Júpiter", 79, 1.899E27, 1.4313E15, 139820, 750000000, 11.86, 1, PlanetaV2.tipoPlaneta.GASEOSO, true);
        p2.imprimir();
        System.out.println("Densidad del planeta = "
                + p2.calcularDensidad());
        System.out.println("Es planeta exterior = "
                + p2.esPlanetaExterior());
    }

}
