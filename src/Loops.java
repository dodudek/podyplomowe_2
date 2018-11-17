public class Loops {
    public static void main(String[] args) {

        /*for (;;){
            System.out.println("Pętla nieskończona");
        }*/

       /* for (int i=1; i<100;i++){
            System.out.println("i= " + i);
        }*/

      /* int i = 0;
       while (i<100){
           System.out.println("i= "+i);
           i++;
       }*/

     /* int i =0;
      do {
          System.out.println("i=" +1);
          i++;

      }while(i<100);*/
    /*}while(false); / pętla wykona sie minimum raz*/

       /* int i =0;
        String [] array = {"raz", "dwa", "trzy", "cztery", "pięć", "dwa", "trzy"};
        final String FORBIDEN = "cztery";

        System.out.println("---------------------------------- START");
        while (i< array.length){

            if (array[i].equals(FORBIDEN)){
                i++;
                continue;

            }
            System.out.println(array[i++]);

        }
        System.out.println("---------------------------------- KONIEC");
*/
        for (int i=0; i<10; i++){
            for (int j=0; j<10; j++){
                System.out.println("i= " +i + " j=" +j);
                if ((i==5) && (j ==5)){
                    break;
                }
            }
        }
    }
}
