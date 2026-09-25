
package cajero;


public class Persona {
    
    // Atributos
    private String nombre;
    private String cuenta;
    private String contraseña;
    private double saldo;

    // Constructor
    public Persona(String nombre, String cuenta, String contraseña, double saldo) {
        this.nombre = nombre;
        this.cuenta = cuenta;
        this.contraseña = contraseña;
        this.saldo = saldo;
    }

    // Métodos GET
    public String getNombre() {
        return nombre;
    }

    public String getCuenta() {
        return cuenta;
    }

    public String getContraseña() {
        return contraseña;
    }

    public double getSaldo() {
        return saldo;
    }

    // Método para depositar
    public boolean depositar(double monto) {
        if (monto > 0) {
            saldo = saldo + monto;
            return true;
        }
        return false;
    }

    // Método para retirar
    public boolean retirar(double monto) {
        if (monto > 0 && monto <= saldo) {
            saldo = saldo - monto;
            return true;
        }
        return false;
    }
}
