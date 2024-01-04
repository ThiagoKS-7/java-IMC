package com.javaimc;

/**
 * Hello world!
 *
 */
public class Principal {
    public static void main(String[] args) {
        Paciente p1 = new Paciente(70d, 1.75);
        Paciente p2 = new Paciente(130d, 1.8);
        Paciente p3 = new Paciente(50d, 1.8);

        p1.diagnostico();
        p2.diagnostico();
        p3.diagnostico();
    }
}
