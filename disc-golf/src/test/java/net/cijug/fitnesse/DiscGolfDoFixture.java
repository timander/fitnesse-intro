package net.cijug.fitnesse;

import fitlibrary.DoFixture;
import net.cijug.discgolf.Course;
import net.cijug.discgolf.Game;
import net.cijug.discgolf.Hole;


public class DiscGolfDoFixture extends DoFixture {

    private Game game;

    public DiscGolfDoFixture() {
        game = new Game(new Course());
    }


    public boolean holeHasParOf(String hole, Integer par) {
        game.addHole(new Hole(hole, par));
        return true;
    }


    public boolean playerThrewTimesForHole(String player, Integer numberOfThrows, String hole) {
        game.player(player).threw(numberOfThrows, game.getCourse().getHole(hole));
        return true;
    }


    public String theWinnerIs() {
        return game.winner().getName();
    }


    public String totalScoreForIs(String player) {
        return game.player(player).score();
    }
}
