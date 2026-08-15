package Methods;
import Classes.Exercise3.*;

public class Exercise3 {
    public Books [][] FillBooksMatrix(Books [][] b) {
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                b[i][j] = new Books("Libro " + (i*10 + j + 1), "Autor " + (i*10 + j + 1), Math.random() * 100 + 1);
            }
        }
        return b;
    }

    public Books FindMostExpensiveBook(Books [][] b) {
        Books mostExpensiveBook = b[0][0];
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                if (b[i][j].getPrice() > mostExpensiveBook.getPrice()) {
                    mostExpensiveBook = b[i][j];
                }
            }
        }
        return mostExpensiveBook;
    }
}