package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    @Override
    public List<Truck> get() {
        Truck truck1 = new Truck("TruckOne", "black", 10);
        Truck truck2 = new Truck("TruckTwo", "white", 15);
        Truck truck3 = new Truck("TruckThree", "red", 20);
        return List.of(truck1, truck2, truck3);
    }
}
