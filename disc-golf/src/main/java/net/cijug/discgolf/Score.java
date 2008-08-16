package net.cijug.discgolf;

public class Score {

    public String calculate(Integer numberOfThrows, Integer par) {
        int score = par - numberOfThrows;
        if (score == 0) return "0";
        return score < 0 ? ("+") + Math.abs(score) : ("-") + Math.abs(score);
    }

}
