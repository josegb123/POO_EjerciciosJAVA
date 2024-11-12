package Ejercicio2_05;

public class CuentaBancariaMainAppV2 {

    /**
     * Metodo main que crea una cuenta bancaria sobre las cuales se realizan las
     * operaciones de consignar y retirar
     * @param args
     */
    public static void main(String args[]) {
        CuentaBancariaV2 cuenta = new CuentaBancariaV2("Pedro", "Perez", 123456789, CuentaBancariaV2.tipo.AHORROS, 1.5);
        cuenta.imprimir();
        cuenta.consignar(200000);
        cuenta.consignar(300000);
        cuenta.retirar(400000);
        
        
        //Prueba ejercicio
        System.out.println("\n");
        System.out.println("El interes del mes actual es: " + cuenta.calcularInteresSimple(6));
        cuenta.imprimir();
    }
}
