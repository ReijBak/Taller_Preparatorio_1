import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Exercises e = new Exercises();
        boolean GoOn = true;
        while (GoOn) {
            try {
                System.out.println("\n==========================================================\n");
                System.out.println("           BIENVENIDO AL PROGRAMA DE EJERCICIOS           ");
                System.out.println("\n==========================================================\n");
                System.out.println("Ingrese el número del ejercicio que desea ejecutar (1-10): ");
                System.out.println("Presione 0 para salir.");
                int opt = sc.nextInt();
                sc.nextLine(); // Clear the buffer
                switch (opt) {
                    case 0:
                        System.out.println("Saliendo del programa...");
                        GoOn = false;
                        break;
                    case 1:
                        e.Exercise_1();
                        break;
                    case 2:
                        e.Exercise_2();
                        break;
                    case 3:
                        e.Exercise_3();
                        break;
                    case 4:
                        e.Exercise_4();
                        break;
                    case 5:
                        e.Exercise_5();
                        break;
                    case 6:
                        e.Exercise_6();
                        break;
                    case 7:
                        e.Exercise_7();
                        break;
                    case 8:
                        e.Exercise_8();
                        break;
                    case 9:
                        e.Exercise_9();
                        break;
                    case 10:
                        e.Exercise_10();
                        break;
                    default:
                        System.out.println("Opción inválida. Por favor, ingrese un número del 1 al 10.");
                }
            } catch (Exception ex) {
                System.out.println("Error: " + ex.getMessage());
                sc.nextLine(); // Clear the buffer
            }

        }
    }
}