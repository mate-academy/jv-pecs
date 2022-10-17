package core.mate.academy.model;

import core.mate.academy.interfaces.Workable;

public abstract class Machine implements Workable {
    private String name;
    private String color;

    public Machine() {
    }

    public Machine(String name, String color) {
        this.name = name;
        this.color = color;
    }
}
