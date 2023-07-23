package core.mate.academy.service;

import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    @Override
    public List<? extends Machine> get() {
        List<Truck> trucks = new ArrayList<>();
        trucks.add(new Truck("green", 2005));
        return trucks;
    }
}
