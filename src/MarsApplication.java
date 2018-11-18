
import sun.security.provider.ConfigFile;



import javax.swing.*;



public class MarsApplication {

    public static void main(String[] args) {

        MarsRobot Spirit = new MarsRobot("eksploatacja", 2, -60);
        MarsRobot Spirit2 = new MarsRobot("oczekiwanie", 4, -40);
        MarsRobot Spirit3 = new MarsRobot("powrót do bazy", 5, -133);
        MarsRobot Spirit4 = new MarsRobot("powrót do bazy", 4);



        Spirit.showAttributes();



        System.out.println("Zwiększamy prędkość do 3.");



        Spirit.speed = 3;

        Spirit.showAttributes();



        System.out.println("Zmiana temperatury na -90.");

        Spirit.temperature = -90;

        Spirit.showAttributes();



        System.out.println("Sprawdanie temperatury.");

        Spirit.checkStatus();



    }

}