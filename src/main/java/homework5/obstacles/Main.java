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

        Obstacle obstacle1 = new Wall(8);
        obstacles.add(obstacle1);


        Obstacle obstacle2 = new Racetrack(15);
        obstacles.add(obstacle2);

        Obstacle obstacle3 = new Wall(4);
        obstacles.add(obstacle3);

        Obstacle obstacle4 = new Racetrack(151);
        obstacles.add(obstacle4);

        Obstacle obstacle5 = new Racetrack(200);
        obstacles.add(obstacle5);


        Participant participant1 = new Cat(150, 12, "Snezhok");
        participants.add(participant1);

        Participant participant2 = new Cat(500, 10, "Stezhok");
        participants.add(participant2);

        Participant participant3 = new Human(50, 12, "Kozhanniy");
        participants.add(participant3);

        Participant participant4 = new Human(300, 12, "Valeriy");
        participants.add(participant4);

        Participant participant5 = new Robot(5000, 50, "GP-008|35|4");
        participants.add(participant5);

        Participant participant6 = new Robot(2000, 2, "Roomba");
        participants.add(participant6);


        for (int i = 0; i < participants.size(); i++) {
            int totalDistance = 0;
            int totalWallsOvercome = 0;
            System.out.println();

            Participant participant = participants.get(i);

            for (int j = 0; j < obstacles.size(); j++) {
                if (obstacles.get(j) instanceof Wall) {

                    Wall current = ((Wall) obstacles.get(j));
                    boolean result = current.overcome(participant);

                    if (!result) {
                        System.out.println("Participant " + participant.getName() + " didn`t get over " + current.getClass().getName() + " "
                                + current.getHeight() + " meters height on distance of " + totalDistance + " meters. Total overcomed walls: " + totalWallsOvercome);
                        break;

                    }
                    totalWallsOvercome++;
                    System.out.println("Participant " + participant.getName() + " got over " + current.getClass().getName() + " "
                            + current.getHeight() + " meters height on distance of " + totalDistance + " meters.");

                } else {
                    Racetrack current = ((Racetrack) obstacles.get(j));
                    boolean result = current.overcome(participant);

                    if (!result) {

                        System.out.println("Participant " + participant.getName() + " didn`t run over " + current.getClass().getName() + " "
                                + current.getLength() + " meters length on distance of " + (totalDistance + participant.getRunLength()) + " meters. Total overcomed walls: " + totalWallsOvercome);
                        break;

                    }
                    totalDistance += current.getLength();
                    System.out.println("Participant " + participant.getName() + " run over " + current.getClass().getName() + " "
                            + current.getLength() + " meters length on distance of " + totalDistance + " meters.");

                }
            }
        }


    }

}
