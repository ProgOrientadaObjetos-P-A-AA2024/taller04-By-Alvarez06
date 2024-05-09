package paquete01;

import paquete02.Automotor;

public class Ejecutor {

    public static void main(String[] args) {
        Automotor doc1 = new Automotor("Byron", "Alvarez", 860.5f, 1105749939);
        Automotor doc2 = new Automotor("Erick", "Toledo", 1200.95f);

        doc1.calcularSueldoTotal();
        doc2.calcularSueldoTotal();

        System.out.printf("%s\n", doc1);
        System.out.printf("%s\n", doc2);
        
        //DIAGRAMA DEL DIA POR HACER
        
    }

}
