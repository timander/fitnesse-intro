package net.cijug.discgolf;

import java.util.Map;
import java.util.HashMap;
import java.util.Set;


public class Player {

    private Map<Hole, Integer> score;
    private String name;

    public Player(String name) {
        this.name = name;
        score = new HashMap<Hole, Integer>();
    }

    public void threw(Integer numberOfThrows, Hole hole) {
        if (score == null){
            score = new HashMap<Hole, Integer>();
        }
        score.put(hole, numberOfThrows);
    }

    public Integer numberOfThrows(){
        Integer numberOfThrows = 0;
        Set<Hole> holeSet = score.keySet();
        for (Hole hole : holeSet) {
            numberOfThrows += score.get(hole);
        }
        return numberOfThrows;
    }

    public Integer currentScore(){
        Integer totalPar = 0;
        Set<Hole> holeSet = score.keySet();
        for (Hole hole : holeSet) {
            totalPar += hole.getPar();
        }
        return numberOfThrows() - totalPar;
    }

    public String getName() {
        return name;
    }
}
