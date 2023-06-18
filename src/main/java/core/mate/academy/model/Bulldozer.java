package core.mate.academy.model;

import java.util.List;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private String name;
    private String color;

    public Bulldozer() {
    }

    public Bulldozer(String name, String color) {
        this.color = color;
        this.name = name;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
