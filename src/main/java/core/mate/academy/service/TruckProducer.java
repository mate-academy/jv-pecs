package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {

    @Override
    public List<Truck> get() {
        Truck truck1 = new Truck("Truck 1", "red");
        Truck truck2 = new Truck("Truck 2", "green");
        Truck truck3 = new Truck("Truck 3", "blue");
        return List.of(truck1, truck2, truck3);
    }
}
