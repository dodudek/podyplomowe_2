
    public class MarsRobot implements Robot {

        String status;

        int speed;

        float temperature;

        MarsRobot (String status, int speed, float temperature){
            this.status = status;
            this.speed = speed;
            this.temperature = temperature;

        }

        MarsRobot (String status, int speed){
            this.status = status;
            this.speed = speed;
            this.temperature = temperature;

        }



        public void checkStatus (){

            System.out.println("Bieżący status:" +status);

        }

        public void checkTemperature() {

            if (temperature < -80) {

                status = "Powrót do domu";

                speed = 5;

            }

        }



        void showAttributes() {

            System.out.println("Status:" + status);

            System.out.println("Prędkość:" + speed);

            System.out.println("Temperatura:" + temperature);



        }



    }

