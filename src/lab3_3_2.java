public class lab3_3_2 {
    public static void main(String[] args) {
        String slowo = args [0];

        long liczba = 0;

        switch (slowo){
            case "jeden":
                liczba = 1;
                break;

            case "dwa":
                liczba = 2;
                break;

            case "trzy":
                liczba = 3;
                break;

            case "cztery":
                liczba = 4;
                break;

            case "pięć":
                liczba = 5;
                break;

            case "sześć":
                liczba = 6;
                break;

            case "siedem":
                liczba = 7;
                break;

            case "osiem":
                liczba = 8;
                break;

            case "dziewięć":
                liczba = 9;
                break;

            case "dziesięć":
                liczba = 10;
                break;

        }

        System.out.println(slowo + " to:" + liczba);

    }
}
