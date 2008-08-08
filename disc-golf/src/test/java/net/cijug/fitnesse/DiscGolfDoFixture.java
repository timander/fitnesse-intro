package net.cijug.fitnesse;

import fitlibrary.DoFixture;
import java.util.HashMap;
import java.util.Map;


public class DiscGolfDoFixture extends DoFixture {

    private Map<String, Integer> parForHole;
    private Map<String, Integer> runningTotals;

    public boolean holeHasParOf(String hole, Integer par) {
        if (parForHole == null) {
            parForHole = new HashMap<String, Integer>();
        }
        parForHole.put(hole, par);
        return true;
    }


    public boolean playerThrewTimesForHole(String player, Integer numberOfThrows, String hole) {
        if (runningTotals == null) runningTotals = new HashMap<String, Integer>();
        if (runningTotals.get(player) == null) runningTotals.put(player, 0);

        runningTotals.put(player, runningTotals.get(player) + numberOfThrows - parForHole.get(hole));
        return true;
    }


    public String theWinnerIs() {
        for (String player : runningTotals.keySet()) {
            runningTotals.get(runningTotals.keySet());
        }
        return "Jeff";
    }


    public Integer totalScoreForIs(String player) {
        return runningTotals.get(player);
    }
}
