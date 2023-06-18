package core.mate.academy.model;

import core.mate.academy.service.MachineProducer;
import core.mate.academy.service.MachineService;

public abstract class Machine implements Workable{
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
