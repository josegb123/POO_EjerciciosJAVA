package Ejercicio2_01;

public class PersonaV2 {

    String nombre;
    String apellidos;
    String númeroDocumentoIdentidad;
    int añoNacimiento;
    String nacionalidad;
    char sexo;

    PersonaV2(String nombre, String apellidos, String númeroDocumentoIdentidad, int añoNacimiento, String nacionalidad, char sexo) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.númeroDocumentoIdentidad = númeroDocumentoIdentidad;
        this.añoNacimiento = añoNacimiento;
        this.nacionalidad = nacionalidad;
        this.sexo = sexo;
    }

    void imprimir() {
        System.out.println("Nombre = " + nombre);
        System.out.println("Apellidos = " + apellidos);
        System.out.println("Número de documento de identidad = " + númeroDocumentoIdentidad);
        System.out.println("Año de nacimiento = " + añoNacimiento);
        System.out.println("Nacionalidad = " + nacionalidad);
        System.out.println("Sexo = " + sexo);
        System.out.println();
    }

}
