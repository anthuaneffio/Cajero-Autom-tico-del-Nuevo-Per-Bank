package cajero;
import java.util.ArrayList;
public class DatosCajero {

    // ArrayList para almacenar las personas temporalmente
    public static ArrayList<Persona> personas = new ArrayList<>();

    // Matriz para almacenar datos de las cuentas
    // [usuario, nombre, saldo]
    public static String[][] cuentas = {
        {"usuario", "Cliente", "1000.00"}
    };

    // Agregar una persona al ArrayList
    public static void agregarPersona(Persona persona) {
        personas.add(persona);
    }

    // Buscar una persona en el ArrayList
    public static Persona buscarPersona(String cuenta) {

        for (Persona persona : personas) {
            if (persona.getCuenta().equals(cuenta)) {
                return persona;
            }
        }

        return null;
    }

    // Buscar una cuenta en la matriz
    public static String[] buscarCuentaEnMatriz(String usuario) {

        for (int i = 0; i < cuentas.length; i++) {

            if (cuentas[i][0].equals(usuario)) {
                return cuentas[i];
            }
        }

        return null;
    }
}