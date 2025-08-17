package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.Arrays;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    @Override
    public List<Truck> get() {
        return Arrays.asList(new Truck(1000), new Truck(1500), new Truck(2000));
    }
}
