public class Const {
    public static void main(String[] args) {
       new BB();
    }
}

class AA {
    AA(){
        System.out.println("Działa konstruktor klasy AA");
    }
    AA(boolean arg){
        System.out.println("Działa konstruktor z argumentem klasy AA, \t" + arg);
    }
}

class BB extends AA{
    BB(){
        super(true);
        System.out.println("Działa konstruktor klasy BB");
    }

}
