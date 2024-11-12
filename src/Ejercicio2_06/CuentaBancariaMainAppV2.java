package Ejercicio2_06;

public class CuentaBancariaMainAppV2 {

    /**
     * Metodo main que crea una cuenta bancaria sobre las cuales se realizan las
     * operaciones de consignar y retirar
     *
     * @param args
     */
    public static void main(String args[]) {
        CuentaBancariaV2 cuenta1 = new CuentaBancariaV2("Pedro", "Pérez", 123456789, CuentaBancariaV2.tipo.AHORROS, 1.5);
        CuentaBancariaV2 cuenta2 = new CuentaBancariaV2("Pablo", "Pinzón", 44556677, CuentaBancariaV2.tipo.AHORROS, 1.5);
        cuenta1.consignar(200000);
        cuenta2.consignar(100000);
        cuenta1.compararCuentas(cuenta2);
        cuenta1.transferencia(cuenta2, 50000);
        cuenta1.consultarSaldo();
        cuenta2.consultarSaldo();
        System.out.println("");
        //Prueba ejercicio
        cuenta1.transferencia(cuenta2, 150000);
        System.out.println("La cuenta 1 esta " + ((cuenta1.activa == true) ? "Activa" : "Inactiva"));
        cuenta1.consultarSaldo();
        cuenta2.consultarSaldo();
    }
}
