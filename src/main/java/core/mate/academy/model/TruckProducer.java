package core.mate.academy.model;

import core.mate.academy.service.MachineProducer;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Machine> {
    @Override
    public List<Machine> get() {
        List<Machine> machines = new ArrayList<>();
        machines.add(new Truck());
        machines.add(new Truck());

        return machines;
    }
}
