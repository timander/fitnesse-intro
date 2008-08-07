package net.cijug.fitnesse;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import fitlibrary.DoFixture;
import fit.ColumnFixture;


public class CalculateScoreFixture extends ColumnFixture {

    public int numberOfThrows;
    public int par;

    public String score(){
        int score = par - numberOfThrows;
        if (score == 0) return "0";
        return score < 0 ? ("+") + Math.abs(score) : ("-") + Math.abs(score);
    }

}

