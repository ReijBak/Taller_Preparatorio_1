import Methods.*;
import Classes.Exercise1.*;
import Classes.Exercise2.*;
import Classes.Exercise3.*;
import Classes.Exercise4.*;
import Classes.Exercise5.*;
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
        boolean goOn = true;
        while (goOn) {
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

    public void Exercise_3() {
        Exercise3 e = new Exercise3();
        Books[][] b = new Books[3][10];
        b = e.FillBooksMatrix(b);
        boolean goOn = true;
        while (goOn) {
            try {
                System.out.println("\n=============================//=============================\n");
                System.out.println("Bienvenido al ejercicio 3, por favor seleccione una opción:\n" +
                        "1. Mostrar todos los libros\n" +
                        "2. Buscar el libro más caro\n" +
                        "3. Volver al menú principal");
                int opt = sc.nextInt();
                sc.nextLine(); // Clear the buffer
                switch (opt) {
                    case 1:
                        System.out.println("Listado de libros:");
                        for (int i = 0; i < b.length; i++) {
                            for (int j = 0; j < b[i].length; j++) {
                                if (b[i][j] != null) {
                                    System.out.println("-------------------------------");
                                    System.out.println("Título: " + b[i][j].getTitle());
                                    System.out.println("Autor: " + b[i][j].getAuthor());
                                    System.out.printf("Precio: %.2f\n", b[i][j].getPrice());
                                }
                            }
                        }
                        break;
                    case 2:
                        Books mostExpensiveBook = e.FindMostExpensiveBook(b);
                        System.out.println("El libro más caro es:");
                        System.out.println("-------------------------------");
                        System.out.println("Título: " + mostExpensiveBook.getTitle());
                        System.out.println("Autor: " + mostExpensiveBook.getAuthor());
                        System.out.printf("Precio: %.2f\n", mostExpensiveBook.getPrice());
                        break;
                    case 3:
                        System.out.println("Saliendo del ejercicio 3...");
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

    public void Exercise_4() {
        Exercise4 e = new Exercise4();
        Seats[][] s = new Seats[3][10];
        s = e.FillSeatsMatrix(s);
        boolean goOn = true;
        while (goOn) {
            try {
                System.out.println("\n=============================//=============================\n");
                System.out.println("Bienvenido al ejercicio 4, por favor seleccione una opción:\n" +
                        "1. Mostrar todos los asientos\n" +
                        "2. Ordenar asientos por precio\n" +
                        "3. Volver al menú principal");
                int opt = sc.nextInt();
                sc.nextLine(); // Clear the buffer
                switch (opt) {
                    case 1:
                        System.out.println("Listado de asientos:");
                        for (int i = 0; i < s.length; i++) {
                            for (int j = 0; j < s[i].length; j++) {
                                if (s[i][j] != null) {
                                    System.out.println("-------------------------------");
                                    System.out.println("Número: " + s[i][j].getNumber());
                                    System.out.println("Fila: " + s[i][j].getRow());
                                    System.out.printf("Precio: %.2f\n", s[i][j].getPrice());
                                }
                            }
                        }
                        break;
                    case 2:
                        s = e.OrderSeatsRowsByPrice(s);
                        System.out.println("Asientos ordenados por precio:");
                        for (int i = 0; i < s.length; i++) {
                            for (int j = 0; j < s[i].length; j++) {
                                if (s[i][j] != null) {
                                    System.out.println("-------------------------------");
                                    System.out.println("Número: " + s[i][j].getNumber());
                                    System.out.println("Fila: " + s[i][j].getRow());
                                    System.out.printf("Precio: %.2f\n", s[i][j].getPrice());
                                }
                            }
                        }
                        break;
                    case 3:
                        System.out.println("Saliendo del ejercicio 4...");
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

    public void Exercise_5() {
        Exercise5 e = new Exercise5();
        Products5[][] p1 = new Products5[3][10];
        Products5[][] p2 = new Products5[3][10];
        p1 = e.FillProductsMatrix(p1);
        p2 = e.FillProductsMatrix(p2);
        boolean goOn = true;
        while (goOn) {
            try {
                System.out.println("\n=============================//=============================\n");
                System.out.println("Bienvenido al ejercicio 5, por favor seleccione una opción:\n" +
                        "1. Mostrar todos los productos del primer inventario\n" +
                        "2. Mostrar todos los productos del segundo inventario\n" +
                        "3. Combinar inventarios\n" +
                        "4. Volver al menú principal");
                int opt = sc.nextInt();
                sc.nextLine(); // Clear the buffer
                switch (opt) {
                    case 1:
                        System.out.println("Listado de productos del primer inventario:");
                        for (int i = 0; i < p1.length; i++) {
                            for (int j = 0; j < p1[i].length; j++) {
                                if (p1[i][j] != null) {
                                    System.out.println("-------------------------------");
                                    System.out.println("Nombre: " + p1[i][j].getName());
                                    System.out.printf("Precio: %.2f\n", p1[i][j].getPrice());
                                    System.out.println("Cantidad: " + p1[i][j].getStock());
                                }
                            }
                        }
                        break;
                    case 2:
                        System.out.println("Listado de productos del segundo inventario:");
                        for (int i = 0; i < p2.length; i++) {
                            for (int j = 0; j < p2[i].length; j++) {
                                if (p2[i][j] != null) {
                                    System.out.println("-------------------------------");
                                    System.out.println("Nombre: " + p2[i][j].getName());
                                    System.out.printf("Precio: %.2f\n", p2[i][j].getPrice());
                                    System.out.println("Cantidad: " + p2[i][j].getStock());
                                }
                            }
                        }
                        break;
                    case 3:
                        Products5[][] combined = e.CombineProducts(p1, p2);
                        System.out.println("Inventarios combinados:");
                        for (int i = 0; i < combined.length; i++) {
                            for (int j = 0; j < combined[i].length; j++) {
                                if (combined[i][j] != null) {
                                    System.out.println("-------------------------------");
                                    System.out.println("Nombre: " + combined[i][j].getName());
                                    System.out.printf("Precio: %.2f\n", combined[i][j].getPrice());
                                    System.out.println("Cantidad: " + combined[i][j].getStock());
                                }
                            }
                        }
                        break;
                    case 4:
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