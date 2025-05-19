import java.util.Scanner;
public class Opcion {
    private static final Scanner Onichan = new Scanner(System.in);
    public static int obtenerNumero(String mensaje){
        int numeroTemporal;
        System.out.println(mensaje + ": ");
        numeroTemporal = Onichan.nextInt();
        return numeroTemporal;
    }
    public static void main(String[] args) {
        int numero1 = obtenerNumero("Ingrese un dia");
        switch (numero1) {
            case 1:
                System.out.println("Domingo");
                break;
                case 2:
                    System.out.println("Lunes");
                    break;
                    case 3:
                        System.out.println("Martes");
                        break;
                        case 4:
                            System.out.println("Miercoles");
                            break;
                            case 5:
                                System.out.println("Jueves");
                                break;
                                case 6:
                                    System.out.println("Viernes");
                                    break;
                                    case 7:
                                        System.out.println("Sabado");
                                        break;
                                        default:
                                            System.out.println("Dia invalido");
                                            break;
        }
    }
}