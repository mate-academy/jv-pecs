package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    @Override
    public List<Truck> get() {
        Truck truck1 = new Truck();
        truck1.setId(1);
        truck1.setModel("4410");

        Truck truck2 = new Truck();
        truck2.setId(2);
        truck2.setModel("5510");

        List<Truck> trucks = new ArrayList<>();
        trucks.add(truck1);
        trucks.add(truck2);
        return trucks;
    }
}
