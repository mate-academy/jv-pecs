package core.mate.academy.service;

import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;

import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Machine> {
    @Override
    public List<? extends Machine> get() {
        List<Truck> trucks = new ArrayList<>();
        trucks.add(new Truck("truck7", 7));
        trucks.add(new Truck("truck8", 8));
        trucks.add(new Truck("truck9", 9));
    return trucks;
    }
}
