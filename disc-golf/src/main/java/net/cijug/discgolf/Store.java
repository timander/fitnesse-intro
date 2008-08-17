package net.cijug.discgolf;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;


public class Store {

    private Set<Disc> discs = new HashSet<Disc>();
    public boolean addToInventory(Disc disc) {
        return discs.add(disc);
    }


    public Disc findDisc(String discName) {
        for (Disc disc : discs) {
            if (discName.equals(disc.getName())) {
                return disc;
            }
        }
        return null;
    }


    public Set<Disc> getDiscs() {
        return Collections.unmodifiableSet(discs);
    }


    public void sell(Disc disc) {
        discs.remove(disc);
    }
}
