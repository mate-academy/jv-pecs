package core.mate.academy.service;

import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    @Override
    public List<? extends Machine> get() {
        List<Truck> trucks = new ArrayList<>();
        trucks.add(new Truck(1, 2, 3));
        trucks.add(new Truck(4, 5, 6));
        return trucks;
    }
}
