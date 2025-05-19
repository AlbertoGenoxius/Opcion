/*Ejercicio crea un programa en java que te diga que mes pertenece a cada estacion del año
usando un switch case para el mes y JOptionPane.showMessageDialog y usando funciones y que todo 
lo que pida al usuario sea en ingles*/
import javax.swing.JOptionPane;
public class Estacion{
    public static void main(String[] args) {
        int mes = Integer.parseInt(JOptionPane.showInputDialog("Enter the month (1-12): "));
        switch (mes) {
            case 1:
                case 2:
                    case 12:
                        JOptionPane.showMessageDialog(null, "Winter");
                        break;
                        case 3:
                            case 4:
                                case 5:
                                    JOptionPane.showMessageDialog(null, "Spring");
                                    break;
                                    case 6:
                                        case 7:
                                            case 8:
                                                JOptionPane.showMessageDialog(null, "Summer");
                                                break;
                                                case 9:
                                                    case 10:
                                                        case 11:
                                                            JOptionPane.showMessageDialog(null, "Autumn");
                                                            break;
                                                            default:
                                                                JOptionPane.showMessageDialog(null, "Invalid month");
                                                                break;
        }
    }
}