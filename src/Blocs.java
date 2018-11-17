public class Blocs {
    public static void main(String[] args) {
        int x = 5;
        {
            int y = 10;
            y = y + x;
            System.out.println("y= " + y);
        }

        System.out.println("x = " + x);
        //System.out.println("y = " + y); nie ma takiej możliwości bo y jest zmienną zainicjowaną w bloku
    }
}