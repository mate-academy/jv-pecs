package core.mate.academy.model;

import core.mate.academy.service.MachineProducer;
import java.util.List;

public abstract class Machine implements Workable, MachineProducer {
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

    public List<? extends Machine> get() {
        return null;
    }
}
