package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    @Override
    public List<Truck> get() {
        Truck truck1 = new Truck("tru1", "Yellow", "tank trucks");
        Truck truck2 = new Truck("tru2", "Black", "cargo vans");
        Truck truck3 = new Truck("tru3", "Red", "grain trucks");
        return List.of(truck1, truck2, truck3);
    }
}
