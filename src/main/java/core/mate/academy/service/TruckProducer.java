package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    private Truck truck1 = new Truck(10, "truck1", "white");
    private Truck truck2 = new Truck(20, "truck2", "black");
    private Truck truck3 = new Truck(30, "truck3", "green");

    @Override
    public List<Truck> get() {
        return List.of(truck1, truck2, truck3);
    }
}
