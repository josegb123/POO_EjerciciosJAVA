package Ejercicio2_01;

public class PersonaV2MainApp {

    public static void main(String args[]) {
        PersonaV2 p1 = new PersonaV2("Pedro", "Pérez", "1053121010", 1998,"Colombia", 'H');
        PersonaV2 p2 = new PersonaV2("Luis", "León", "1053223344", 2001,"Venezuela", 'H');
        p1.imprimir();
        p2.imprimir();
    }
}
