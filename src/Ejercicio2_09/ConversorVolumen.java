package Ejercicio2_09;

import java.text.DecimalFormat;

public class ConversorVolumen {

    double litros; // Volumen en litros

    // Factores de conversion
    final double FACTOR_LITROS_GALONES = 0.226; // 1 galon = 4.41 litros
    final double FACTOR_LITROS_PINTAS = 2.11338; // 1 pinta = 0.46 litros
    final double FACTOR_LITROS_BARRILES = 0.00628981; // 1 barril = 158.99 litros
    final double FACTOR_LITROS_METROS_CUBICOS = 0.001; // 1 m³ = 1000 litros
    final double FACTOR_LITROS_HECTOLITROS = 0.01; // 1 hectolitro = 100 litros

    public ConversorVolumen(double litros) {
        this.litros = litros; // Volumen en litros
    }

    public double convertirLitrosToGalones() {
        return litros * FACTOR_LITROS_GALONES;
    }

    public double convertirLitrosToPintas() {
        return litros * FACTOR_LITROS_PINTAS;
    }

    public double convertirLitrosToBarriles() {
        return litros * FACTOR_LITROS_BARRILES;
    }

    public double convertirLitrosToMetrosCubicos() {
        return litros * FACTOR_LITROS_METROS_CUBICOS;
    }

    public double convertirLitrosToHectolitros() {
        return litros * FACTOR_LITROS_HECTOLITROS;
    }

    public static void main(String args[]) {
        
        ConversorVolumen conversor = new ConversorVolumen(10); // 10 litros

        System.out.printf("Volumen en litros: %.4f%n", conversor.litros);

        System.out.printf("Volumen en galones: %.4f%n", conversor.convertirLitrosToGalones());

        System.out.printf("Volumen en pintas: %.4f%n ", conversor.convertirLitrosToPintas());

        System.out.printf("Volumen en barriles: %.4f%n", conversor.convertirLitrosToBarriles());

        System.out.printf("Volumen en metros cubicos: %.4f%n", conversor.convertirLitrosToMetrosCubicos());

        System.out.printf("Volumen en hectolitros: %.4f%n", conversor.convertirLitrosToHectolitros());

    }
}