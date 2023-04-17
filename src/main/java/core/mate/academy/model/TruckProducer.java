package core.mate.academy.model;

import core.mate.academy.service.MachineProducer;
import java.util.List;

public class TruckProducer implements MachineProducer {
    @Override
    public List<? extends Machine> get() {
        return List.of(new Truck(), new Truck(), new Truck());
    }
}
