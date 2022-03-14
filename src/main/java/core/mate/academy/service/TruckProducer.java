package core.mate.academy.service;

import core.mate.academy.model.Truck;

import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {

    @Override
    public List<Truck> get() {
        Truck truck1 = new Truck("Joe", "pink", 100);
        Truck truck2 = new Truck("Cris", "", 400);
        Truck truck3 = new Truck("Rick", "pink", 250);
        return List.of(truck1, truck2, truck3);
    }
}
