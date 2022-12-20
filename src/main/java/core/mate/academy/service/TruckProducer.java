package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    private List<Truck> trucks = new ArrayList<>();
    private Truck truck1 = new Truck();
    private Truck truck2 = new Truck();
    private Truck truck3 = new Truck();

    @Override
    public List<Truck> get() {
        trucks.add(truck1);
        trucks.add(truck2);
        trucks.add(truck3);
        return trucks;
    }
}
