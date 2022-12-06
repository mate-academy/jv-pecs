package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    private final List<Truck> trucks = new ArrayList<>();

    {
        trucks.add(new Truck("GMC", "White"));
        trucks.add(new Truck("MACK", "Black"));
        trucks.add(new Truck("Ford", "Red"));
    }

    @Override
    public List<Truck> get() {
        return trucks;
    }
}
