package net.cijug.fitnesse;

import fit.RowFixture;
import net.cijug.discgolf.Disc;
import net.cijug.discgolf.Player;
import java.util.ArrayList;
import java.util.List;


public class DiscsPlayerCanAffordFixture extends RowFixture {

    private List<Disc> discs;
    private Player player;

    public DiscsPlayerCanAffordFixture(Player player, List<Disc> discs) {
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
