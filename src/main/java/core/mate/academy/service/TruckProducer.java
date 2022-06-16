package core.mate.academy.service;

import core.mate.academy.model.Truck;

import java.util.List;

public class TruckProducer implements MachineProducer<Truck>{
    private final Truck truck1 = new Truck();
    private final Truck truck2 = new Truck();
    private final Truck truck3 = new Truck();
    private final List<Truck> truckList = List.of(truck1, truck2, truck3);

    @Override
    public List<Truck> get() {
        return truckList;
    }
}
