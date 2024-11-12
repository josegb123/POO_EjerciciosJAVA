package Ejercicio2_06;

public class CuentaBancariaMainApp {

    /**
     * Metodo main que crea una cuenta bancaria sobre las cuales se realizan las
     * operaciones de consignar y retirar
     *
     * @param args
     */
    /**
     * Método main que crea dos cuentas bancarias sobre las cuales se realizan
     * las operaciones de consignar, comparar, transferir y consultar saldos
     */
    public static void main(String args[]) {
        CuentaBancaria cuenta1 = new CuentaBancaria("Pedro", "Pérez", 123456789, CuentaBancaria.tipo.AHORROS, 1.5);
        CuentaBancaria cuenta2 = new CuentaBancaria("Pablo", "Pinzón", 44556677, CuentaBancaria.tipo.AHORROS, 1.5);
        cuenta1.consignar(200000);
        cuenta2.consignar(100000);
        cuenta1.compararCuentas(cuenta2);
        cuenta1.transferencia(cuenta2, 50000);
        cuenta1.consultarSaldo();
        cuenta2.consultarSaldo();
    }
}
