package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer {
    @Override
    public List get() {
        List<Truck> machine = new ArrayList<>();
        machine.add(new Truck());
        return machine;
    }
}
