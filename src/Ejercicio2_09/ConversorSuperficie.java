package Ejercicio2_09;

import java.text.DecimalFormat;

public class ConversorSuperficie {

    double area; // Area en metros cuadrados

    // Factores de conversion
    final double FACTOR_AREAS_HECTAREAS = 0.0001; // 1 area = 0.0001 hectareas
    final double FACTOR_AREAS_KILOMETROS_CUADRADOS = 0.000001; // 1 area = 0.000001 km²
    final double FACTOR_AREAS_FANEGA = 0.000154999; // 1 area = 0.000154999 fanegas
    final double FACTOR_AREAS_ACRES = 0.000247105; // 1 area = 0.000247105 acres

    public ConversorSuperficie(double area) {
        this.area = area; // Area en "areas"
    }

    public double convertirAreasToHectareas() {
        return area * FACTOR_AREAS_HECTAREAS;
    }

    public double convertirAreasToKilometrosCuadrados() {
        return area * FACTOR_AREAS_KILOMETROS_CUADRADOS;
    }

    public double convertirAreasToFanegas() {
        return area * FACTOR_AREAS_FANEGA;
    }

    public double convertirAreasToAcres() {
        return area * FACTOR_AREAS_ACRES;
    }

    public static void main(String args[]) {
        
        ConversorSuperficie conversor = new ConversorSuperficie(1); // 1 area = 100 m2

        System.out.printf("Area en metros cuadrados (1 area = 100 m2): %.4f%n", conversor.area * 100);

        System.out.printf("Area en hectareas: %.4f%n", conversor.convertirAreasToHectareas());

        System.out.printf("Area en kilometros cuadrados: %.4f%n", conversor.convertirAreasToKilometrosCuadrados());

        System.out.printf("Area en fanegas: %.4f%n", conversor.convertirAreasToFanegas());

        System.out.printf("Area en acres: %.4f%n", conversor.convertirAreasToAcres());

    }
}
