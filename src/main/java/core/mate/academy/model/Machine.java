package core.mate.academy.model;

import core.mate.academy.service.MachineProducer;

public abstract class Machine implements MachineProducer, Workable {
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
