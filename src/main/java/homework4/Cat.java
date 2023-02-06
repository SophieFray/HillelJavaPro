package src.main.java.homework4;

public class Cat extends Animals {

    private static int catCounter = 0;
    private String name;

    @Override
    public void run(int runLength) {
        while (true) {

            if (runLength > 200 || runLength < 1) {
                System.out.println("\nCats cant run more then 200m or less then 1m!");
            } else {
                System.out.println("\n" + this.name + " runs " + runLength + " meters.");
            }
            break;

        }
    }


    public void swim(int swimLength) {
        while (true) {

            if (swimLength < 1) {
                System.out.println("\nIncorrect parameter!");
            } else {
                System.out.println("\n" + this.name + " is dead! Cat`s can`t swim!");
            }
            break;

        }
    }

    public Cat(String name) {
        this.name = name;
        catCounter++;
    }


    public static int getCatCounter() {
        return catCounter;
    }

    public String getName() {
        return name;
    }
}
