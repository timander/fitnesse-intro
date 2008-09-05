package net.cijug.discgolf;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;


public class Player {

    private Map<Hole, Score> scoreCard;
    private Money money = new Money(0.0);
    private Set<Disc> discs;
    private String name;

    public Player(String name) {
        this.name = name;
        scoreCard = new HashMap<Hole, Score>();
        discs = new HashSet<Disc>();
    }


    public void buy(Disc disc) {
        discs.add(disc);
        money = money.subtract(disc.getPrice());
    }


    public Set<Disc> ownsDiscs() {
        return new HashSet<Disc>(discs);
    }


    public Score score() {
        return null; // todo: what is my score?
    }


    public void threw(Integer numberOfThrows, Hole hole) {
        if (scoreCard == null) {
            scoreCard = new HashMap<Hole, Score>();
        }
        scoreCard.put(hole, new Score(hole.getPar(), numberOfThrows));
    }


    public Money getMoney() {
        return money;
    }


    public void setMoney(Money money) {
        this.money = money;
    }


    public String getName() {
        return name;
    }
}
