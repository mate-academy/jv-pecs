package core.mate.academy.service;

import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer {
    private List<Machine> trucks = new ArrayList<>();

    public TruckProducer() {
        trucks.add(new Truck());
        trucks.add(new Truck());
        trucks.add(new Truck());
    }

    @Override
    public List get() {
        return trucks;
    }
}
