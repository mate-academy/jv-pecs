package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.List;

public class TruckProducer implements MachineProducer {
    private Truck truck1 = new Truck(1,"Flatbed truck");
    private Truck truck2 = new Truck(2,"Tipper truck");
    private Truck truck3 = new Truck(3,"Crane truck");

    private List<Truck> trucks = List.of(truck1, truck2, truck3);

    @Override
    public List<Truck> get() {
        return trucks;
    }
}
