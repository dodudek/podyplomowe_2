import java.sql.SQLOutput;

public class HalfDollars {
    public static void main(String[] args) {
        int[] denver = {1_700_000, 4_600_000, 2_100_000};
        int[] philadelphia = new int [denver.length];
        int[] total = new int [denver.length];
        int avereage;
        int sume = 0;

        //start
        int[] array1 = {1_800_000, 5_000_000, 2_500_000};

        for (int i=0; i<denver.length; i++){
            philadelphia[i]=array1[i];
            total [i] = denver [i] + philadelphia [i];
            System.out.println("Produkcja w " +2012 + i + ":");
            System.out.format("%,d%n",total[i]);
            sume += total[i];
        }

        avereage = (sume/denver.length);
        System.out.format("Srednia wartość: %,d%n", avereage);

       /* philadelphia[0] = 1_800_000;
        philadelphia[1] = 5_000_000;
        philadelphia[2] = 2_500_000;

        total [0] = denver [0] + philadelphia [0];
        total [1] = denver [1] + philadelphia [1];
        total [2] = denver [2] + philadelphia [2];*/

        //avereage = ((total[0]+total[1]+total[2])/3);

        /*System.out.println("Produkcja w 2012: ");
        System.out.format("%,d%n",total[0]);

        System.out.println("Produkcja w 2013: ");
        System.out.format("%,d%n",total[1]);

        System.out.println("Produkcja w 2014: ");
        System.out.format("%,d%n",total[2]);

        System.out.println("Srednia produkcja: ");
        System.out.format("%,d%n",avereage);*/

    }
}
