/*Programa de java en la que un usuario con una funcion le va a preguntar sobre un numero 
si el numero que ingrese es negativo o cero volvera a preguntar sobre el numero hasta que se 
positivo usando funciones y Scanner */
import java.util.Scanner;
public class Numero2 {
    private static final Scanner scanner = new Scanner(System.in);
    public static int obtenerNumero(String mensaje){
        int numero = 0;
        while (numero <= 0) {
            System.out.println(mensaje + ": ");
            numero = scanner.nextInt();
            if (numero <= 0) {
                System.out.println("El numero ingresado es negativo o cero, por favor ingreselo de nuevo.");
            }
        }
        return numero;
    }
    public static void main(String[] args) {
        int numero = obtenerNumero("Ingrese un numero");
    }
}