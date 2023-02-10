package src.main.java.homework4;

public class Dog extends Animals {
    private static int dogCounter = 0;
    private final String name;

    public Dog(String name) {
        dogCounter++;
        this.name = name;
    }

    public static int getDogCounter() {
        return dogCounter;
    }

    @Override
    public void run(int runLength) {


        if (runLength > 500 || runLength < 1) {
            System.out.println("\nDogs cant run more then 500m or less then 1m!");
        } else {
            System.out.println("\n" + this.name + " runs " + runLength + " meters.");
        }

    }

    @Override
    public void swim(int swimLength) {

        if (swimLength > 10 || swimLength < 1) {
            System.out.println("\nDogs cant swim more then 10m or less then 1m!");
        } else {
            System.out.println("\n" + this.name + " swims " + swimLength + " meters.");
        }

    }

    public String getName() {
        return name;
    }
}

