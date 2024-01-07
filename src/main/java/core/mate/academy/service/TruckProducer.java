package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer {
    private List<Truck> trucks = new ArrayList<>();

    public TruckProducer() {
        trucks.add(new Truck("Splinkler", "white", 12500));
        trucks.add(new Truck("SANY", "orange", 21200));
    }

    @Override
    public List<Truck> get() {
        return trucks;
    }
}
