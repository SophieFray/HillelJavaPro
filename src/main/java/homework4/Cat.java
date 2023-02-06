package src.main.java.homework4;

public class Cat extends Animals {

    private static int catCounter = 0;
    private static int deadCatCounter = 0;
    private final String name;

    public Cat(String name) {
        this.name = name;
        catCounter++;
    }

    public static int getCatCounter() {
        return catCounter;
    }

    public static int getDeadCatCounter() {
        return deadCatCounter;
    }

    @Override
    public void run(int runLength) {


        if (runLength > 200 || runLength < 1) {
            System.out.println("\nCats cant run more then 200m or less then 1m!");
        } else {
            System.out.println("\n" + this.name + " runs " + runLength + " meters.");
        }


    }

    @Override
    public void swim(int swimLength) {

        if (swimLength < 1) {
            System.out.println("\nIncorrect parameter!");
        } else {
            System.out.println("\n" + this.name + " is dead! Cat`s can`t swim!");
            deadCatCounter++;
        }

    }

    public String getName() {
        return name;
    }
}
