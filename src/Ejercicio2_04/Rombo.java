/*Agregar una nueva clase denominada Rombo. Definir los métodos
para calcular el área y el perímetro de esta nueva figura geométrica.
u Agregar una nueva clase denominada Trapecio. Definir los méto-
dos para calcular el área y el perímetro de esta nueva figura geomé-
trica.*/
package Ejercicio2_04;

public class Rombo {

    double diagonalMayor;
    double diagonalMenor;
    double lado;

    public Rombo(double diagonalMayor, double diagonalMenor) { //sin saber la medida del lado
        this.diagonalMayor = diagonalMayor;
        this.diagonalMenor = diagonalMenor;
        this.lado = Math.sqrt(Math.pow(diagonalMayor / 2, 2) + Math.pow(diagonalMenor / 2, 2)); //ley de pitagoras
    }
    
    public Rombo(double diagonalMayor, double diagonalMenor, double lado) {
        this.diagonalMayor = diagonalMayor;
        this.diagonalMenor = diagonalMenor;
        this.lado = lado;
    }

    public double calcularArea() {
        return (diagonalMayor * diagonalMenor) / 2;
    }

    public double calcularPerimetro() {        
        return 4 * lado;
    }

}
