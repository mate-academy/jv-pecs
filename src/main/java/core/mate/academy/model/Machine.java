package core.mate.academy.model;

import core.mate.academy.data.Colors;
import java.util.Random;

public abstract class Machine implements Workable {
    private static final Random random = new Random();
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

    public void of(String name, String color) {
        setName(name);
        setColor(color);
    }

    public static String getRandomColor() {
        Colors[] color = Colors.values();
        return color[random.nextInt(color.length)].toString().toLowerCase();
    }
}
