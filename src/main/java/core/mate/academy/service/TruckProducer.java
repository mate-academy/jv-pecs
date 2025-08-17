package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer {
    @Override
    public List<Truck> get() {
        Truck truck = new Truck();
        List<Truck> trucks = new ArrayList<>();
        trucks.add(truck);
        return trucks;
    }
}
