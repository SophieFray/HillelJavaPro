package src.main.java.homework5.participant;

public class Robot implements Participant{

    private int runLength;
    private int jumpHeight;

    private String name;

    public Robot(int runLength, int jumpHeight, String name) {
        this.runLength = runLength;
        this.jumpHeight = jumpHeight;
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println("Running...");
    }

    @Override
    public void jump() {
        System.out.println("Jumping...");
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
