package src.main.java.homework5.participant;

public class Cat implements Participant{

    private int runLength;
    private int jumpHeight;

    private String name;

    public Cat(int runLength, int jumpHeight, String name) {
        this.runLength = runLength;
        this.jumpHeight = jumpHeight;
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println("\n" + name + " is running...");
    }

    @Override
    public void jump() {
        System.out.println("\n" + name + " is jumping...");
    }


    @Override
    public int getRunLength() {
        return runLength;
    }

    @Override
    public int getJumpHeight() {
        return jumpHeight;
    }

    @Override
    public String getName() {
        return name;
    }
}
