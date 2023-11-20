package core.mate.academy.model;

import core.mate.academy.random.Color;
import core.mate.academy.random.Model;
import java.util.Random;

public abstract class Machine implements Workable {
    private String name;
    private String color;
    private Random random = new Random();

    public Machine() {
    }

    public Machine(String name, String color) {
        this.name = name;
        this.color = color;
    }

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

    public String getRandomName() {
        return Model.values()[random.nextInt(Model.values().length)].name();
    }

    public String getRandomColor() {
        return Color.values()[random.nextInt(Color.values().length)].name();
    }
}
