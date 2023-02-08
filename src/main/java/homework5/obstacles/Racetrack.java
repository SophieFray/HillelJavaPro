package src.main.java.homework5.obstacles;

import src.main.java.homework5.participant.Participant;

public class Racetrack implements Obstacle {

    private int length;

    final private String name = "Racetrack";

    public Racetrack(int length) {
        this.length = length;
    }

    @Override
    public boolean overcome(Participant participant) {
        participant.run();
        if (participant.getRunLength() > length) {
            System.out.println("Participant " + participant.getName() + " ran over " + name + " "
                    + length + " meters long!");
            participant.setTotalDistance(length + participant.getTotalDistance());
            participant.setTotalObstacles(participant.getTotalObstacles() + 1);
            return true;
        }
        participant.setTotalDistance(participant.getTotalDistance() + participant.getRunLength());
        System.out.println("Participant " + participant.getName() + " didn`t run over " + name + " "
                + length + " meters length!");
        return false;
    }

    public int getLength() {
        return length;
    }
}
