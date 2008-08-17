package net.cijug.fitnesse;

import fitlibrary.DoFixture;
import net.cijug.discgolf.Course;
import net.cijug.discgolf.Game;
import net.cijug.discgolf.Hole;
import net.cijug.discgolf.Player;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;


public class DiscGolfDoFixture extends DoFixture {

    private DiscsForSaleFixture discShop;
    private Game game;

    public DiscGolfDoFixture() {
        game = new Game(new Course());
    }


    public DiscsForSaleFixture discShop() {
        if (discShop == null) {
            discShop = new DiscsForSaleFixture();
        }
        return discShop;
    }


    public Player findPlayer(String name) {
        return game.player(name);
    }


    public boolean getNetDotCijugDotFitnesseDotDiscGolfDoFixture() {
        return true;
    }


    public boolean holeHasParOf(String hole, Integer par) {
        game.addHole(new Hole(hole, par));
        return true;
    }


    public boolean playerBeginsWith(Player player, String money) {
        player.setMoney(new Double(money.replaceAll("\\$", "")));
        return true;
    }


    public boolean playerBuys(Player player, String[] discs) {
        Set<String> discSet = new HashSet<String>();
        discSet.addAll(Arrays.asList(discs));
        return discShop.purchase(player, discSet);
    }


    public DiscsPlayerCanAffordFixture playerCanAfford(Player player) {
        return new DiscsPlayerCanAffordFixture(player, discShop.getDiscs());
    }


    public String playerHas(Player player) {
        return player.getMoneyFormatted();
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
