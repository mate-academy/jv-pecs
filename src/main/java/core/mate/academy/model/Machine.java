package core.mate.academy.model;

import core.mate.academy.service.MachineProducer;

public abstract class Machine implements Workable , MachineProducer {
    private String name;
    private String color;
public Machine(String color, String name){
    this.name = this.name;
    this.color = this.color;
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
}
