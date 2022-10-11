package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    private List<Truck> trucks = new ArrayList<>();

    @Override
    public List<Truck> get() {
        Truck truck1 = new Truck("First", "yellow", "typeOfBody", 15);
        Truck truck2 = new Truck("Second", "green", "typeOfBody2", 18);
        trucks.add(truck1);
        trucks.add(truck2);
        return trucks;
    }
}

