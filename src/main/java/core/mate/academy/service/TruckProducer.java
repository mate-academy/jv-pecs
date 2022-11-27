package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {

    public List<Truck> get() {
        Truck truck1 = new Truck("Chornonog", "Pink", 80, 115);
        Truck truck2 = new Truck("Kombinate", "White", 74, 140);
        List<Truck> trucks = new ArrayList<>();
        trucks.add(truck1);
        trucks.add(truck2);
        return trucks;
    }
}
