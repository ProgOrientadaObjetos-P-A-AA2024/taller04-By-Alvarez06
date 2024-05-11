package paquete01;

import paquete02.LibretaNotas;

public class Ejecutor {

    public static void main(String[] args) {
        LibretaNotas est1 = new LibretaNotas("Byron", 10, 9, 9.5f);
        LibretaNotas est2 = new LibretaNotas("Jeis", 8.75f, 9.8f);

        est1.calcularPromedio();
        est2.calcularPromedio();

        System.out.printf("%s\n", est1);
        System.out.printf("%s\n", est2);

    }

}
