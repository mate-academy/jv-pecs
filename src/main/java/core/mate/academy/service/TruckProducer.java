package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    @Override
    public List<Truck> get() {
        Truck truck1 = new Truck("Iveco", 2016, "used", "diesel");
        Truck truck2 = new Truck("Mercedes-Benz", 2023, "new", "diesel");
        Truck truck3 = new Truck("Scania", 2018, "used", "diesel");
        return List.of(truck1, truck2, truck3);
    }
}
