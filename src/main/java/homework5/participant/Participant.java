package src.main.java.homework5.participant;

public interface Participant {

    void run();

    void jump();

    int getRunLength();

    int getJumpHeight();

    int getTotalDistance();

    int getTotalObstacles();

    String getName();

    void setTotalDistance(int totalDistance);

    void setTotalObstacles(int totalObstacles);


}
