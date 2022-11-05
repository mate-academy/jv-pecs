package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    private final List<Truck> trucks = new ArrayList<>();

    @Override
    public List<Truck> get() {
        Truck truck1 = new Truck(50_000,"Box truck");
        truck1.setName("Truck-1");
        truck1.setColor("Black");
        trucks.add(truck1);
        Truck truck2 = new Truck(45_000,"Flatbed truck");
        truck2.setName("Truck-2");
        truck2.setColor("White");
        trucks.add(truck2);
        Truck truck3 = new Truck(47_000,"Box truck");
        truck3.setName("Truck-3");
        truck3.setColor("Black");
        trucks.add(truck3);
        return trucks;
    }
}
