package paquete01;

import paquete02.Automotor;

public class Ejecutor {

    public static void main(String[] args) {
        Automotor mat1 = new Automotor(1105749939, "Ford", 2022, 65000f);
        Automotor mat2 = new Automotor("Chevrolet", 2020, 30900f);

        mat1.calcularValorMatricula();
        mat2.calcularValorMatricula();

        System.out.printf("%s\n", mat1);
        System.out.printf("%s\n", mat2);

    }

}
