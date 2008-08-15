package net.cijug.fitnesse;

import fitlibrary.DoFixture;
import net.cijug.discgolf.Course;
import net.cijug.discgolf.Game;
import net.cijug.discgolf.Hole;
import net.cijug.discgolf.Player;
import net.cijug.discgolf.Disc;
import fit.RowFixture;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;


public class DiscGolfDoFixture extends DoFixture {

    private Game game;
    List<Disc> discs;

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

    public boolean playerHas(String player, String money){
        //todo: implement me
        return true;
    }

    public boolean discsForSale(Map<String, String> discNameAndPrice){
        //todo: implement me
        discs = new ArrayList<Disc>();
        discNameAndPrice.keySet();
        for (String discName : discNameAndPrice.keySet()) {
            discs.add(new Disc(discName, Double.valueOf(discNameAndPrice.get(discName))));
        }

        return true;
    }

    public DiscsPlayerCanAffordFixture playerCanAfford(Player player) {
        return new DiscsPlayerCanAffordFixture(player, discs);
    }


    public String totalScoreForIs(String player) {
        return game.player(player).score();
    }
}
