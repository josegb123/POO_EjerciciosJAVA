package Ejercicio2_11;

public class ArticuloCientificoMainApp {

    /**
     * Metodo main que instancia un articulo cientifico y muestra sus datos en
     * pantalla
     */
    public static void main(String args[]) {
        String[] palabras = {"Fisica ", "Espacio ", "Tiempo "};
        ArticuloCientifico articulo = new ArticuloCientifico("La teoria especial de la relatividad ", "Albert Einstein ", palabras, "Anales de Fisica ", 1913, "Las leyes de la fisica son las mismas en todos los sistemas de referencia inerciales. ");
        articulo.imprimir();
    }

}
