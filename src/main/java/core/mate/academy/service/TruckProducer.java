package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.List;

public class TruckProducer implements MachineProducer {
    private final Truck truck1 = new Truck();
    private final Truck truck2 = new Truck("low-tonnage",3,"automatic");
    private final Truck truck3 = new Truck("middle-tonnage",5, "mechanic");

    @Override
    public List<Truck> get() {
        return List.of(truck1, truck2, truck3);
    }
}
