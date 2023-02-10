package src.main.java.homework5.obstacles;

import src.main.java.homework5.participant.Participant;

public class Wall implements Obstacle {

    private int height;

    final private String name = "Wall";

    public Wall(int height) {
        this.height = height;
    }

    @Override
    public boolean overcome(Participant participant) {
        participant.jump();
        if (participant.getJumpHeight() > height) {
            System.out.println("Participant " + participant.getName() + " got over " + name + " "
                    + height + " meters height!");
            participant.setTotalObstacles(participant.getTotalObstacles() + 1);
            return true;

        }
        System.out.println("Participant " + participant.getName() + " didn`t get over " + name + " "
                + height + " meters height!");
        return false;
    }


    public int getHeight() {
        return height;
    }
}
