package core.mate.academy.model;

import core.mate.academy.model.enums.TruckType;

public class Truck extends Machine {
    private TruckType type;

    public Truck() {
    }


    public void doWork() {

        System.out.println("Truck started to work");
    }
}
