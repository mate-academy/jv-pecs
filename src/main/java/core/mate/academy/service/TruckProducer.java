package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    @Override
    public List<Truck> get() {
        return new ArrayList<>(List.of(new Truck(20),
                new Truck(40), new Truck(15)));
    }
}
