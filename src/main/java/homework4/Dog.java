package src.main.java.homework4;

public class Dog extends Animals {
    private static int dogCounter = 0;
    private String name;

    @Override
    public void run(int runLength) {

        while (true) {

            if (runLength > 500 || runLength < 1) {
                System.out.println("Dogs cant run more then 500m or less then 1m!");
            } else {
                System.out.println(this.name + " runs " + runLength + " meters.");
            }
            break;

        }
    }

    public void swim ( int swimLength){
        while (true) {


            if (swimLength > 10 || swimLength < 1) {
                System.out.println("Dogs cant swim more then 10m or less then 1m!");
            } else {
                System.out.println(this.name + " swims " + swimLength + " meters.");
            }
            break;


        }

    }



    public Dog(String name) {
            dogCounter++;
            this.name = name;
        }


        public static int getDogCounter () {
            return dogCounter;
        }

        public String getName () {
            return name;
        }
    }

