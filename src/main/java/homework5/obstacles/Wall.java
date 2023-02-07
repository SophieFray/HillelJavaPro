package src.main.java.homework5.obstacles;

import src.main.java.homework5.participant.Participant;

public class Wall implements Obstacle{

    private int height;

    public Wall(int height) {
        this.height = height;
    }

    @Override
    public boolean overcome(Participant participant) {
        if(participant.getJumpHeight() > height){

            return true;

        } return false;
    }

    public int getHeight() {
        return height;
    }
}
