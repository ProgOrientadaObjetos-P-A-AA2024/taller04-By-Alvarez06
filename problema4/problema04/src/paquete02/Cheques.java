package paquete02;

public class Cheques {

    private String nombreCliente;
    private String nombreBanco;
    private float valorCheque;
    private float valorComision;

    public Cheques(String n, String m, float a) {
        nombreCliente = n;
        nombreBanco = m;
        valorCheque = a;
    }

    public Cheques(String n, float a) {
        nombreCliente = n;
        nombreBanco = "Banco del Ecuador";
        valorCheque = a;
    }

    public void establecerNombreCliente(String n) {
        nombreCliente = n;
    }

    public void establecerNombreBanco(String s) {
        nombreBanco = s;
    }

    public void establecerValorCheque(float n) {
        valorCheque = n;
    }

    public void calcularValorComision() {
        valorComision = valorCheque * 0.003f;
    }

    public String obtenerNombreCliente() {
        return nombreCliente;
    }

    public String obtenerNombreBanco() {
        return nombreBanco;
    }

    public float obtenerValorCheque() {
        return valorCheque;
    }

    public float obtenerValorComision() {
        return valorComision;
    }

    @Override
    public String toString() {
        String cadena = String.format("Valor Comision de un Cheque\n"
                + "Nombre del Cliente: %s\n"
                + "Nombre del Banco: %s\n"
                + "Valor del Cheque: %.2f\n"
                + "Comision por parte del Banco: %.2f\n",
                nombreCliente, nombreBanco, valorCheque, valorComision);
        return cadena;
    }

}
