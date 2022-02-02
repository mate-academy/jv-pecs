package core.mate.academy.model;

import core.mate.academy.service.MachineProducer;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    @Override
    public List<Truck> getListMachines() {
        return List.of(new Truck(2),
                new Truck(4));
    }
}
