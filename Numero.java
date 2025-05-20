/*Programa de java en la que un usuario con una funcion le va a preguntar sobre un numero 
si el numero que ingrese es negativo o cero volvera a preguntar sobre el numero hasta que se 
positivo usando funciones y JOptionPane.showMessageDialog */
import javax.swing.JOptionPane;
public class Numero {
    public static int Numero(String mensaje) {
        int numeroTemporal = 0;
        while (numeroTemporal <= 0) {
            numeroTemporal = Integer.parseInt(JOptionPane.showInputDialog(mensaje + ": "));
            if (numeroTemporal <= 0) {
                JOptionPane.showMessageDialog(null, "El numero ingresado es negativo o cero, por favor ingrese un numero positivo");
            }
        }
        return numeroTemporal;
    }
    public static void main(String[] args) {
        int numero = Numero("Ingrese un numero");
    }
}