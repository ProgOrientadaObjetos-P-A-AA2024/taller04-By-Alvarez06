package paquete02;

public class Automotor {

    private int cedula;
    private String marca;
    private int anioFabricacion;
    private float valorVehiculo;
    private float valorMatricula;
    

    public Automotor(int c, String m, int a, float v) {
        cedula = c;
        marca = m;
        anioFabricacion = a;
        valorVehiculo = v;
    }
    
    public Automotor(String m, int a, float v) {
        cedula = 110999999;
        marca = m;
        anioFabricacion = a;
        valorVehiculo = v;
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
