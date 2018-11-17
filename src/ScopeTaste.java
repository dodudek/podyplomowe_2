import java.awt.*;

public class ScopeTaste {

    int test = 10; //typ prosty

    Point point  = new Point(1,3); // obiekt

    void changePoint(Point point){
        point.x = 5;
        point.y = 5;
    }

    void chengeTaste(int taste){
        taste = 5;
    }


    void printTest (){
        int test =20;
        System.out.println("test: " + this.test);
    }

    public static void main(String[] args) {
        ScopeTaste scopeTaste = new ScopeTaste();
        //scopeTaste.printTest();

        System.out.println("test: " + scopeTaste.test);
        System.out.println("point: " + scopeTaste.point);
        System.out.println("----------------------------");
        scopeTaste.chengeTaste(scopeTaste.test);
        scopeTaste.changePoint(scopeTaste.point);
        System.out.println("test: " + scopeTaste.test);
        System.out.println("point: " + scopeTaste.point);
    }
}
