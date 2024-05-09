package paquete02;

public class Profesores {

    private String nombre;
    private String apellido;
    private float sueldoBasico;
    private float sueldoTotal;
    private int cedula;

    public Profesores(String s, String a, float s1, int c) {
        nombre = s;
        apellido = a;
        sueldoBasico = s1;
        cedula = c;
    }

    public Profesores(String s, String a, float s1) {
        nombre = s;
        apellido = a;
        sueldoBasico = s1;
        cedula = 1109999999;
    }

    public void establecerNombre(String s) {
        nombre = s;
    }

    public void establecerApellido(String s) {
        apellido = s;
    }

    public void establecerSueldoBasico(float n) {
        sueldoBasico = n;
    }

    public void establecerCedula(int n) {
        cedula = n;
    }

    public void calcularSueldoTotal() {
        sueldoTotal = sueldoBasico + (sueldoBasico * 0.2f);
    }

    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerApellido() {
        return apellido;
    }

    public float obtenerSueldoBasico() {
        return sueldoBasico;
    }

    public float obtenerCedula() {
        return cedula;
    }

    public float obtenerSueldoTotal() {
        return sueldoTotal;
    }

    @Override
    public String toString() {
        String cadena = String.format("Salario de un profesor\n"
                + "Nombre del docente: %s\n"
                + "Apellido: %s\n"
                + "Cedula de Identidad: %d\n"
                + "Sueldo Básico: %.2f\n"
                + "Sueldo Total: %.2f\n",
                nombre, apellido, cedula, sueldoBasico, sueldoTotal);
        return cadena;
    }

}
