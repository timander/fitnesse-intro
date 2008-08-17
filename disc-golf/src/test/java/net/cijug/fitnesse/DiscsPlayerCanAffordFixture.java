package net.cijug.fitnesse;

import fit.RowFixture;
import net.cijug.discgolf.Disc;
import net.cijug.discgolf.Player;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;


public class DiscsPlayerCanAffordFixture extends RowFixture {

    private Player player;
    private Set<Disc> discs;

    public DiscsPlayerCanAffordFixture(Player player, Set<Disc> discs) {
        this.player = player;
        this.discs = discs;
    }


    @Override
    public Class getTargetClass() {
        return Disc.class;
    }


    @Override
    public Object[] query() throws Exception {
        List<Disc> affordableDiscs = new ArrayList<Disc>();
        for (Disc disc : discs) {
            if (player.getMoney() >= disc.getPrice()) {
                affordableDiscs.add(disc);
            }
        }
        return affordableDiscs.toArray();
    }

}
