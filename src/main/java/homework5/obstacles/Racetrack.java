package src.main.java.homework5.obstacles;

import src.main.java.homework5.participant.Participant;

public class Racetrack implements Obstacle{

    private int length;

    public Racetrack(int length) {
        this.length = length;
    }

    @Override
    public boolean overcome(Participant participant) {
        participant.run();
        if(participant.getRunLength() > length){
            return true;
        }
        return false;
    }

    public int getLength() {
        return length;
    }
}
