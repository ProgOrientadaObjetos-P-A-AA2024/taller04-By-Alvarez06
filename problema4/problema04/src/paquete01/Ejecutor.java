package paquete01;

import paquete02.Cheques;

public class Ejecutor {

    public static void main(String[] args) {
        Cheques com1 = new Cheques("Byron Alvarez", "Banco de Guayaquil", 500f);
        Cheques com2 = new Cheques("Mayte Elizalde", 1500f);

        com1.calcularValorComision();
        com2.calcularValorComision();

        System.out.printf("%s\n", com1);
        System.out.printf("%s\n", com2);

        //DIAGRAMA DEL DIA POR HACER
    }

}
