package net.cijug.discgolf;

import java.util.ArrayList;
import java.util.List;
import java.util.SortedSet;
import java.util.Collections;


public class Game {

    private Course course;
    private List<Player> players;

    public Game(Course course) {
        this.course = course;
        players = new ArrayList<Player>();
    }


    public void addHole(Hole hole) {
        getCourse().addHole(hole);
    }


    public Player player(String name) {
        Player player = null;
        for (Player p : players) {
            if (name.equals(p.getName())) {
                player = p;
            }
        }
        if (player == null) {
            player = new Player(name);
            players.add(player);
        }
        return player;
    }


    public Player winner() {
        Collections.sort(players);
        return players.get(0);
    }


    public Course getCourse() {
        return course;
    }
}
