package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {

    @Override
    public List<Truck> get() {
        return List.of(new Truck(20, 1000000),
                new Truck(25, 969354),
                new Truck(30, 1522000));
    }
}
