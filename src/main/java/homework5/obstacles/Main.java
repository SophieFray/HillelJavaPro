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



        Participant participant1 = new Cat(150,12);
        participants.add(participant1);

        Participant participant2 = new Cat(200,15);
        participants.add(participant2);

        Participant participant3 = new Human(50,12);
        participants.add(participant3);

        Participant participant4 = new Human(300,12);
        participants.add(participant4);

        Participant participant5 = new Robot(5000,50);
        participants.add(participant5);

        Participant participant6 = new Robot(2000,2);
        participants.add(participant6);


        for (int i = 0; i < participants.size(); i++) {
            for (int j = 0; j < obstacles.size(); j++) {



            }
        }



    }

}
