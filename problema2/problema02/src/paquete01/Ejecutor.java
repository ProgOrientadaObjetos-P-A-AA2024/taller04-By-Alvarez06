package paquete01;

import paquete02.Profesores;

public class Ejecutor {

    public static void main(String[] args) {
        Profesores doc1 = new Profesores("Byron", "Alvarez", 860.5f, 1105749939);
        Profesores doc2 = new Profesores("Erick", "Toledo", 1200.95f);

        doc1.calcularSueldoTotal();
        doc2.calcularSueldoTotal();

        System.out.printf("%s\n", doc1);
        System.out.printf("%s\n", doc2);

    }

}
