package Methods;
import Classes.Exercise4.*;

public class Exercise4 {
    public Seats [][] FillSeatsMatrix(Seats [][] s) {
        int count = 1;
        for (int i = 0; i < s.length; i++) {
            for (int j = 0; j < s[i].length; j++) {
                s[i][j] = new Seats(count++, i + 1, Math.random() * 100 + 1);
            }
        }
        return s;
    }

    public Seats [][] OrderSeatsRowsByPrice(Seats [][] s) {
        for (int i = 0; i < s.length; i++) {
            for (int j = 0; j < s[i].length - 1; j++) {
                for (int k = 0; k < s[i].length - j - 1; k++) {
                    if (s[i][k].getPrice() > s[i][k + 1].getPrice()) {
                        Seats temp = s[i][k];
                        s[i][k] = s[i][k + 1];
                        s[i][k + 1] = temp;
                    }
                }
            }
        }
        return s;
    }
}