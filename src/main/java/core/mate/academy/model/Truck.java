package core.mate.academy.model;

import core.mate.academy.model.enums.TruckType;

public class Truck extends Machine {
    private TruckType type;

    public Truck() {
    }

    public Truck(String name, String color, TruckType type) {
        super(name, color);
        this.type = type;
    }

    public TruckType getType() {
        return type;
    }

    public void doWork() {
        System.out.println("Truck started to work");
    }
}
