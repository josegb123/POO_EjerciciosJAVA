package Ejercicio2_05;

public class CuentaBancariaMainApp {

    /**
     * Metodo main que crea una cuenta bancaria sobre las cuales se realizan las
     * operaciones de consignar y retirar
     * @param args
     */
    public static void main(String args[]) {
        CuentaBancaria cuenta = new CuentaBancaria("Pedro", "Perez", 123456789, CuentaBancaria.tipo.AHORROS);
        cuenta.imprimir();
        cuenta.consignar(200000);
        cuenta.consignar(300000);
        cuenta.retirar(400000);
    }
}
