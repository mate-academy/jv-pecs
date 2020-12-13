package core.mate.academy.model;

import core.mate.academy.model.enums.TruckType;

public class Truck extends Machine {
    private TruckType type;

    public Truck() {
    }

    public TruckType getType() {
        return type;
    }

    public void setType(TruckType type) {
        this.type = type;
    }

    public void doWork() {

        System.out.println("Truck started to work");
    }
}
