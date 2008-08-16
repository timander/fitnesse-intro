package net.cijug.fitnesse;

import fit.Fixture;
import fitlibrary.DoFixture;
import net.cijug.discgolf.Course;
import net.cijug.discgolf.Game;
import net.cijug.discgolf.Hole;
import net.cijug.discgolf.Player;


public class DiscGolfDoFixture extends DoFixture {
    private DiscsForSaleFixture discShop;

    private Game game;

    public DiscGolfDoFixture() {
        game = new Game(new Course());
    }


    public Fixture discShop() {
        if (discShop == null) {
            discShop = new DiscsForSaleFixture();
        }
        return discShop;
    }


    public Player findPlayer(String name) {
        return game.player(name);
    }


    public boolean holeHasParOf(String hole, Integer par) {
        game.addHole(new Hole(hole, par));
        return true;
    }


    public DiscsPlayerCanAffordFixture playerCanAfford(Player player) {
        return new DiscsPlayerCanAffordFixture(player, discShop.getDiscs());
    }


    public boolean playerHas(Player player, String money) {
        player.setMoney(new Double(money.replaceAll("\\$", "")));
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
