package net.cijug.discgolf;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;


public class Player {
    private Double money = 0.0;

    private Map<Hole, Integer> score;
    private String name;

    public Player(String name) {
        this.name = name;
        score = new HashMap<Hole, Integer>();
    }


    public Integer numberOfThrows() {
        Integer numberOfThrows = 0;
        Set<Hole> holeSet = score.keySet();
        for (Hole hole : holeSet) {
            numberOfThrows += score.get(hole);
        }
        return numberOfThrows;
    }


    public String score() {
        Integer totalPar = 0;
        Set<Hole> holeSet = score.keySet();
        for (Hole hole : holeSet) {
            totalPar += hole.getPar();
        }
        return new Score().calculate(numberOfThrows(), totalPar);
    }


    public Integer scoreAsInteger() {
        return Integer.valueOf(score().replace("+", ""));
    }


    public void threw(Integer numberOfThrows, Hole hole) {
        if (score == null) {
            score = new HashMap<Hole, Integer>();
        }
        score.put(hole, numberOfThrows);
    }


    public Double getMoney() {
        return money;
    }


    public void setMoney(Double money) {
        this.money = money;
    }


    public String getName() {
        return name;
    }
}
