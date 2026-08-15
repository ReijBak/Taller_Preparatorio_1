import Methods.*;
import Classes.Exercise1.*;
import Classes.Exercise2.*;
import java.util.Scanner;
public class Exercises {
    Scanner sc = new Scanner(System.in);
    public void Exercise_1() {
        Exercise1 e = new Exercise1();
        Products[][] p = new Products[3][10];
        p = e.FillProductsMatrix(p);
        boolean goOn = true;
        while (goOn) {
            try {
                System.out.println("\n=============================//=============================\n");
                System.out.println("Bienvenido al ejercicio 1, por favor seleccione una opción:\n" +
                        "1. Mostrar todos los productos\n" +
                        "2. Buscar un producto por nombre\n" +
                        "3. Volver al menú principal");
                int opt = sc.nextInt();
                sc.nextLine(); // Clear the buffer
                switch (opt) {
                    case 1:
                        System.out.println("Listado de productos:");
                        for (int i = 0; i < p.length; i++) {
                            for (int j = 0; j < p[i].length; j++) {
                                if (p[i][j] != null) {
                                    System.out.println("-------------------------------");
                                    System.out.println("Nombre: " + p[i][j].getName());
                                    System.out.printf("Precio: %.2f\n", p[i][j].getPrice());
                                    System.out.println("Cantidad: " + p[i][j].getQuantity());
                                }
                            }
                        }
                        break;
                    case 2:
                        String name = "";
                        System.out.println("Ingrese el nombre del producto que desea buscar: ");
                        name = sc.nextLine();
                        Products productFound = e.FindProductByName(p, name);
                        if (productFound != null) {
                            System.out.println("-------------------------------");
                            System.out.println("Nombre: " + productFound.getName());
                            System.out.printf("Precio: %.2f\n", productFound.getPrice());
                            System.out.println("Cantidad: " + productFound.getQuantity());
                        }
                        break;
                    case 3:
                        System.out.println("Saliendo del ejercicio 1...");
                        goOn = false;
                        break;
                    default:
                        System.out.println("Opción no válida");
                }
            } catch (Exception ex) {
                    System.out.println("Error: " + ex.getMessage());
                    sc.nextLine(); // Clear the buffer
            }
        }
    }
    public void Exercise_2() {
        Exercise2 e = new Exercise2();
        Products2[][] p = new Products2[3][10];
        p = e.FillProductsMatrix(p);
        boolean GoOn = true;
        while (GoOn) {
            try {
                System.out.println("\n=============================//=============================\n");
                System.out.println("Bienvenido al ejercicio 2, por favor seleccione una opción:\n" +
                        "1. Mostrar todos los productos\n" +
                        "2. Suma cantidad de productos en el inventario\n" +
                        "3. Volver al menú principal");
                int opt = sc.nextInt();
                sc.nextLine(); // Clear the buffer
                switch (opt) {
                    case 1:
                        System.out.println("Listado de productos:");
                        for (int i = 0; i < p.length; i++) {
                            for (int j = 0; j < p[i].length; j++) {
                                if (p[i][j] != null) {
                                    System.out.println("-------------------------------");
                                    System.out.println("Nombre: " + p[i][j].getName());
                                    System.out.printf("Precio: %.2f\n", p[i][j].getPrice());
                                    System.out.println("Cantidad: " + p[i][j].getQuantity());
                                }
                            }
                        }
                        break;
                    case 2:
                        int totalQuantity = e.SumProductQuantities(p);
                        System.out.println("La cantidad total de productos en el inventario es: " + totalQuantity);
                        break;
                    case 3:
                        System.out.println("Saliendo del ejercicio 2...");
                        GoOn = false;
                        break;
                    default:
                        System.out.println("Opción no válida");
                }
            } catch (Exception ex) {
                System.out.println("Error: " + ex.getMessage());
                sc.nextLine(); // Clear the buffer
            }
        }
    }

    public void Exercise_3() {
        System.out.println("Hello, desde ejercicio 3!");
    }

    public void Exercise_4() {
        System.out.println("Hello, desde ejercicio 4!");
    }

    public void Exercise_5() {
        System.out.println("Hello, desde ejercicio 5!");
    }

    public void Exercise_6() {
        System.out.println("Hello, desde ejercicio 6!");
    }

    public void Exercise_7() {
        System.out.println("Hello, desde ejercicio 7!");
    }

    public void Exercise_8() {
        System.out.println("Hello, desde ejercicio 8!");
    }

    public void Exercise_9() {
        System.out.println("Hello, desde ejercicio 9!");
    }

    public void Exercise_10() {
        System.out.println("Hello, desde ejercicio 10!");
    }
}