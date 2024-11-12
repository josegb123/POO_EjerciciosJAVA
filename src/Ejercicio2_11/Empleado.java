
package Ejercicio2_11;


public class Empleado {
    int id;
    String nombre;
    String apellidos;
    int edad;

    public Empleado() {
        this.id = 100;
        this.nombre = "Nuevo empleado";
        this.apellidos = "Nuevo empleado";
        this.edad = 18;
        
    }

    public Empleado(int id, String nombre, String apellidos, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }
    
    

}
