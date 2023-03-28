package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    @Override
    public List<Truck> get() {
        Truck semiTruck = new Truck(1500, "Semi");
        Truck miniTruck = new Truck(350, "Mini");
        Truck tipperTruck = new Truck(900, "Tipper");
        List<Truck> trucks = new ArrayList<>();
        trucks.add(semiTruck);
        trucks.add(miniTruck);
        trucks.add(tipperTruck);
        return trucks;
    }
}
