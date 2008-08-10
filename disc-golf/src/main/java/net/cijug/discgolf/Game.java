package net.cijug.discgolf;

import java.util.List;
import java.util.ArrayList;


public class Game {

    private Course course;
    private List<Player> players;

    public Game(Course course) {
        this.course = course;
        players = new ArrayList<Player>();
    }


    public Course getCourse() {
        return course;
    }

    public void addHole(Hole hole){
        getCourse().addHole(hole);
    }

    public Player player(String name){
        Player player = null;
        for (Player p : players) {
            if (name.equals(p.getName())){
                player = p;
            }
        }
        if (player == null){
            player = new Player(name);
            players.add(player);
        }
        return player;
    }

    public Player winner() {
        Player winner = null;
        for (Player player : players) {
            if (winner == null){
                winner = player;
            }
            if (player.currentScore() < winner.currentScore()){
                winner = player;
            }
        }
        return winner;

    }
}
