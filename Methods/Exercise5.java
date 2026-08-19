package Methods;
import Classes.Exercise5.*;

public class Exercise5 {
    public Products5 [][] FillProductsMatrix(Products5 [][] p) {
        for (int i = 0; i < p.length; i++) {
            for (int j = 0; j < p[i].length; j++) {
                p[i][j] = new Products5("Producto " + (i*10 + j + 1), Math.random() * 100 + 1, (int) (Math.random() * 10 + 1));

            }
        }
        return p;
    }

    public Products5 [][] CombineProducts(Products5 [][] p1, Products5 [][] p2) {
        Products5 [][] combined = new Products5[p1.length + p2.length][p1[0].length];
        for (int i = 0; i < p1.length; i++) {
            for (int j = 0; j < p1[i].length; j++) {
                if ((p1[i][j].getName()).equals(p2[i][j].getName()) && (p1[i][j].getPrice() == p2[i][j].getPrice())) {
                    combined[i][j] = new Products5(p1[i][j].getName(), p1[i][j].getPrice(), p1[i][j].getStock() + p2[i][j].getStock());
                } else {
                    combined[i][j] = new Products5(p1[i][j].getName(), p1[i][j].getPrice(), p1[i][j].getStock());
                }
            }
        }
        return combined;
    }
}