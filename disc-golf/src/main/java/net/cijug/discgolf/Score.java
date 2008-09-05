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

}
