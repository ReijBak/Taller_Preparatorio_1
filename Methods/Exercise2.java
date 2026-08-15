package Methods;
import Classes.Exercise2.*;

public class Exercise2 {
    public Products2 [][] FillProductsMatrix(Products2 [][] p) {
        for (int i = 0; i < p.length; i++) {
            for (int j = 0; j < p[i].length; j++) {
                p[i][j] = new Products2("Producto " + (i*10 + j + 1), Math.random() * 100 + 1, (int) (Math.random() * 10 + 1));

            }
        }
        return p;
    }

    public int SumProductQuantities(Products2[][] p) {
        int total = 0;
        for (int i = 0; i < p.length; i++) {
            for (int j = 0; j < p[i].length; j++) {
                if (p[i][j] != null) {
                    total += p[i][j].getQuantity();
                }
            }
        }
        return total;
    }
}