package net.cijug.discgolf;

public class Score {
    private Integer numberOfThrows;
    private Integer par;

    public Score(Integer par, Integer numberOfThrows) {
        this.par = par;
        this.numberOfThrows = numberOfThrows;
    }


    public Score(Iterable<Score> scores) {
        Integer totalPar = 0;
        Integer totalNumberOfThrows = 0;
        for (Score score : scores) {
            totalPar += score.getPar();
            totalNumberOfThrows += score.getNumberOfThrows();
        }
        this.par = totalPar;
        this.numberOfThrows = totalNumberOfThrows;
    }


    public Integer intValue() {
        return par - numberOfThrows;
    }


    public Integer getNumberOfThrows() {
        return numberOfThrows;
    }


    public Integer getPar() {
        return par;
    }


    @Override
    public String toString() {
        int score = intValue();
        if (score == 0) return "0";
        return score < 0 ? ("+") + Math.abs(score) : ("-") + Math.abs(score);
    }

}
