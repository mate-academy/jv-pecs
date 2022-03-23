package core.mate.academy.service.machines.producer;

import core.mate.academy.model.Truck;
import core.mate.academy.service.MachineProducer;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    @Override
    public List<Truck> get() {
        Truck truck1 = new Truck("Truck1", "black", 1000, 500);
        Truck truck2 = new Truck("Truck2", "yellow", 1200, 550);
        Truck truck3 = new Truck("Truck3", "red", 1100, 500);
        return List.of(truck1, truck2, truck3);
    }
}
