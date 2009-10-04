package net.cijug.discgolf;

public class Hole {
    private String name;
    private Integer par;

    public Hole(String name, Integer par) {
        this.name = name;
        this.par=par;
    }

    public String getName() {
        return name;
    }

    public Integer getPar() {
        return par;
    }
}
