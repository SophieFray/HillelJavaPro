package src.main.java.homework5.obstacles;

import src.main.java.homework5.participant.Cat;
import src.main.java.homework5.participant.Human;
import src.main.java.homework5.participant.Participant;
import src.main.java.homework5.participant.Robot;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Obstacle> obstacles = new ArrayList<>();
        ArrayList<Participant> participants = new ArrayList<>();

        obstacles.add(new Wall(8));
        obstacles.add(new Racetrack(15));
        obstacles.add(new Wall(4));
        obstacles.add(new Racetrack(151));
        obstacles.add(new Racetrack(200));

        participants.add(new Cat(150, 12, "Snezhok"));
        participants.add(new Cat(500, 10, "Stezhok"));
        participants.add(new Human(50, 12, "Kozhanniy"));
        participants.add(new Human(300, 12, "Valeriy"));
        participants.add(new Robot(5000, 50, "GP-008|35|4"));
        participants.add(new Robot(2000, 2, "Roomba"));

        for (int i = 0; i < participants.size(); i++) {

            System.out.println();

            for (int j = 0; j < obstacles.size(); j++) {

                if (!obstacles.get(j).overcome(participants.get(i))) {

                    System.out.println(participants.get(i).getName() + " failed on " + participants.get(i).getTotalDistance() + " meters. Total overcomed obstacles: " + participants.get(i).getTotalObstacles());
                    break;
                }
            }
        }
    }
}
