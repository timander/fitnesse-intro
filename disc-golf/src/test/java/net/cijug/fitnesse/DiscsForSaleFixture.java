package net.cijug.fitnesse;

import fitlibrary.DoFixture;
import net.cijug.discgolf.Disc;
import net.cijug.discgolf.Player;
import java.util.HashSet;
import java.util.Set;


public class DiscsForSaleFixture extends DoFixture {

    private Set<Disc> discs = new HashSet<Disc>();


    public Set<Disc> getDiscs() {
        return new HashSet<Disc>(discs);
    }


    public boolean purchase(Player player, Set<String> discNames) {
        for (String discName : discNames) {
            Disc disc = findDisc(discName);
            discs.remove(disc);
            player.bought(disc);
        }
        return true;
    }


    public boolean sellsFor(String name, String price) {
        Disc disc = new Disc(name, new Double(price.replaceAll("\\$", "")));
        return discs.add(disc);
    }


    private Disc findDisc(String discName) {
        for (Disc disc : discs) {
            if (discName.equals(disc.getName())) {
                return disc;
            }
        }
        return null;
    }
}
