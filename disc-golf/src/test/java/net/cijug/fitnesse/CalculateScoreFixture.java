package net.cijug.fitnesse;

import fit.ColumnFixture;
import net.cijug.discgolf.Score;


public class CalculateScoreFixture extends ColumnFixture {
    public Integer numberOfThrows;
    public Integer par;

    public String score() {
        return new Score(par, numberOfThrows).toString();
    }
}
