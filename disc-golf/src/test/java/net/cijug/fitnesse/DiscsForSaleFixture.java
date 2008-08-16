package net.cijug.fitnesse;

import fitlibrary.DoFixture;
import net.cijug.discgolf.Disc;
import java.util.ArrayList;
import java.util.List;


public class DiscsForSaleFixture extends DoFixture {

    private List<Disc> discs = new ArrayList<Disc>();


    public boolean sellsFor(String name, String price) {
        Disc disc = new Disc(name, new Double(price.replaceAll("\\$", "")));
        return discs.add(disc);
    }


    public List<Disc> getDiscs() {
        return discs;
    }

}
