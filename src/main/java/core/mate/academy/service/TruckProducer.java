package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    @Override
    public List<Truck> get() {
        Truck truck1 = new Truck();
        Truck truck2 = new Truck("low-tonnage",3,"automatic");
        Truck truck3 = new Truck("middle-tonnage",5, "mechanic");
        return List.of(truck1, truck2, truck3);
    }
}
