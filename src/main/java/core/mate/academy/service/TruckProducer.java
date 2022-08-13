package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {

    @Override
    public List<Truck> get() {
        Truck truck = new Truck("Oil", true, 100);
        Truck truck1 = new Truck("Diesel", false, 200);
        Truck truck2 = new Truck("Oil", false, 300);
        List<Truck> trucks = new ArrayList<>();
        trucks.add(truck);
        trucks.add(truck1);
        trucks.add(truck2);
        return trucks;
    }
}
