package paquete02;

public class LibretaNotas {

    private String nombre;
    private float nota1;
    private float nota2;
    private float nota3;
    private float promedio;

    public LibretaNotas(String s, float n1, float n2, float n3) {
        nombre = s;
        nota1 = n1;
        nota2 = n2;
        nota3 = n3;
    }

    public LibretaNotas(String s, float n1, float n2) {
        nombre = s;
        nota1 = n1;
        nota2 = n2;
        nota3 = 10;
    }

    public void establecerNombre(String s) {
        nombre = s;
    }

    public void establecerNota1(float n) {
        nota1 = n;
    }

    public void establecerNota2(float n) {
        nota2 = n;
    }

    public void establecerNota3(float n) {
        nota3 = n;
    }

    public void calcularPromedio() {
        promedio = (nota1 + nota2 + nota3) / 3;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public float obtenerNota1() {
        return nota1;
    }

    public float obtenerNota2() {
        return nota2;
    }

    public float obtenerNota3() {
        return nota3;
    }

    public float obtenerPromedio() {
        return promedio;
    }

    @Override
    public String toString() {
        String cadena = String.format("Libreta de Calificaciones\n"
                + "Nombre del estudiante: %s\n"
                + "Calificacion 1: %.3f\n"
                + "Calificacion 2: %.3f\n"
                + "Calificacion 3: %.3f\n"
                + "Promedio Total: %.3f\n",
                nombre, nota1, nota2, nota3, promedio);
        return cadena;
    }

}
