package core.mate.academy.service;

import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer {
    private final List<Truck> trucks = new ArrayList<>();

    @Override
    public List<? extends Machine> get() {
        trucks.add(new Truck());
        return trucks;
    }
}
