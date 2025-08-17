package core.mate.academy.service.impl;

import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import core.mate.academy.service.MachineProducer;
import java.util.List;

public class TruckProducer implements MachineProducer<Machine> {
    @Override
    public List<Machine> get() {
        return List.of(new Truck(), new Truck(), new Truck());
    }
}
