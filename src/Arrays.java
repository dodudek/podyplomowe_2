import java.awt.*;
import java.sql.SQLOutput;

public class Arrays {
    public static void main(String[] args) {
        String [] request;
        //Point[] points;

        //int temps [] = new int [99]; //inicjalizacja tablicy o nazwie temps- nie rekomendowany sposób
         int [] temps = new int [99];
         temps [0] = 6;
         temps [1] = 90;
         temps [2] = 78;

        System.out.println(temps [66]);

        int [] i ={1,2,3};
        Point[] markup = {new Point (1,2), new Point (1,5), new Point (4,3)};

        String[] titles = {"Pan", "Pani", "Państwo"};
        System.out.println(titles.length);
    }
}
