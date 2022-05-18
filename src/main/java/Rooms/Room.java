package Rooms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Room {

    private Exit exit;
    private ArrayList<Exit> exits;

    public Room() {
        this.exits = new ArrayList<>();
    }

    public int getNumberOfExits(){
        Random rand = new Random();
        int upperbound = 4;
        int lowerbound = 1;
        int numberOfExits = rand.nextInt(upperbound - lowerbound + 1) + lowerbound;
        return numberOfExits;
    }

    public void getExits(){
        ArrayList exitsList = new ArrayList<>();
        exitsList.add(exit.NORTH);
        exitsList.add(exit.SOUTH);
        exitsList.add(exit.EAST);
        exitsList.add(exit.WEST);
        Collections.shuffle(exitsList);

        for (int i = 0; i < this.getNumberOfExits(); i++){
            this.exits.add((Exit) exitsList.get(i));
        }
    }

    public int getExit() {
        return this.exits.size();
    }
}
