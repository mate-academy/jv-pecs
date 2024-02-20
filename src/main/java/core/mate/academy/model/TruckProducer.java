package core.mate.academy.model;

import core.mate.academy.service.MachineProducer;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    @Override
    public List get() {
        return List.of(new Truck(),
                new Truck(),
                new Truck());
    }
}
