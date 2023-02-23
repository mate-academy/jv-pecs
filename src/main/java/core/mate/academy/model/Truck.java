package core.mate.academy.model;

import core.mate.academy.service.TruckProducer;

public class Truck extends TruckProducer {
    public Truck() {
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
