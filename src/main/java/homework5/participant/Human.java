package src.main.java.homework5.participant;

public class Human implements Participant {

    private int runLength;
    private int jumpHeight;
    private int totalDistance;
    private int totalObstacles;

    private String name;

    public Human(int runLength, int jumpHeight, String name) {
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

    @Override
    public int getTotalDistance() {

        return totalDistance;
    }

    @Override
    public int getTotalObstacles() {

        return totalObstacles;
    }

    ;

    @Override
    public void setTotalDistance(int totalDistance) {
        this.totalDistance = totalDistance;
    }

    @Override
    public void setTotalObstacles(int totalObstacles) {
        this.totalObstacles = totalObstacles;
    }
}
