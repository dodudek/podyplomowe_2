public class StaticTest {
    public static void main(String[] args) {

        B b = new B ();
        b.print();

        A a = b;
        a.print(); // to samo co A.print() - i lepiej właśnie z tego wykorzystywać, zeby nie wprowadzać w błąd

        A.print();
    }
}

class A {
    static void print (){
        System.out.println("A");

    }
}

class B extends A {
    static void print (){
        System.out.println("B");
    }

}
