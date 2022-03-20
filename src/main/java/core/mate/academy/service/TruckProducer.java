package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.List;

public class TruckProducer implements MachineProducer {

    @Override
    public List<Truck> get() {
        Truck truck1 = new Truck("Truck1", "grey", "Kamaz");
        Truck truck2 = new Truck("Truck2", "black", "Mercedes");
        Truck truck3 = new Truck("Truck3", "yellow", "Vaz");
        return List.of(truck1, truck2, truck3);
    }
}
