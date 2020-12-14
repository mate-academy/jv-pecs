package core.mate.academy.service;

import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import java.util.List;

public class TruckProducer implements MachineProducer<Machine> {

    @Override
    public List<Machine> get() {
        return List.of(new Truck(20, 1000000),
                new Truck(25, 969354),
                new Truck(30, 1522000));
    }
}
