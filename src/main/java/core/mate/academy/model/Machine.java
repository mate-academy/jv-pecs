package core.mate.academy.model;

import java.util.Random;

public abstract class Machine implements Workable {
    protected static final Random RANDOM = new Random();
    private String name;
    private String color;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
