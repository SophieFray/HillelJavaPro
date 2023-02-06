package src.main.java.homework5.obstacles;

public class Racetrack implements Obstacle{

    private int length;

    public Racetrack(int length) {
        this.length = length;
    }

    @Override
    public void overcome() {
        System.out.println("test");
    }
}
