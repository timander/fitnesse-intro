package net.cijug.fitnesse;

import fit.RowFixture;
import net.cijug.discgolf.Disc;
import net.cijug.discgolf.Player;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class DiscsPlayerCanAffordFixture extends RowFixture {

    private Player player;
    private Set<Disc> discs;

    public DiscsPlayerCanAffordFixture(Player player, Set<Disc> discs) {
        this.player = player;
        this.discs = new HashSet<Disc>(discs);
    }


    @Override
    public Class getTargetClass() {
        return Disc.class;
    }


    @Override
    public Object[] query() throws Exception {
        return new Disc[0]; // todo: probably should return something?
    }

}
