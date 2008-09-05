package net.cijug.discgolf;

public class Score {
    private Integer numberOfThrows;
    private Integer par;

    public Score(Integer par, Integer numberOfThrows) {
        this.par = par;
        this.numberOfThrows = numberOfThrows;
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
