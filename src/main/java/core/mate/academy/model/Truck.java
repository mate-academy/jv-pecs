package core.mate.academy.model;

import core.mate.academy.enums.TruckSize;

public class Truck extends Machine {
    private TruckSize size;

    public Truck() {
    }

    public Truck(TruckSize size) {
        this.size = size;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
