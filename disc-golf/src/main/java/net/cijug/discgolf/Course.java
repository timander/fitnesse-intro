package net.cijug.discgolf;

import java.util.ArrayList;
import java.util.List;


public class Course {
    List<Hole> holes;

    public Course() {
        holes = new ArrayList<Hole>();
    }

    public void addHole(Hole hole) {
        holes.add(hole);
    }

    public Hole getHole(String name) {
        for (Hole hole : holes) {
            if (hole.getName().equals(name)) {
                return hole;
            }
        }
        return null;
    }
}
