package net.cijug.fitnesse;

import fitlibrary.DoFixture;
import net.cijug.discgolf.Disc;
import net.cijug.discgolf.Player;
import net.cijug.discgolf.Store;
import java.util.Map;
import java.util.Set;


public class DiscsForSaleFixture extends DoFixture {


    private Store store;

    public DiscsForSaleFixture() {
        store = new Store();
    }


    public Set<Disc> getDiscs() {
        return store.getDiscs();
    }


    public boolean purchase(Player player, Set<String> discNames) {
        return false; // todo: implement me
    }


    public boolean sells(Map<String, String> map) {
        return false; // todo: implement me
    }


}
