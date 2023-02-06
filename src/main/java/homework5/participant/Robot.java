package src.main.java.homework5.participant;

public class Robot implements Participant{

    private int runLength;
    private int jumpHeight;

    public Robot(int runLength, int jumpHeight) {
        this.runLength = runLength;
        this.jumpHeight = jumpHeight;
    }

    @Override
    public void run() {
        System.out.println("Running...");
    }

    @Override
    public void jump() {
        System.out.println("Jumping...");
    }
}
