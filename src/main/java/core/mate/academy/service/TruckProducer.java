package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {

    @Override
    public List<Truck> get() {
        return List.of(new Truck("First", "black", 800, "Germany", 82.0),
                new Truck("Second", "grey", 900, "France", 80.0),
                new Truck("Third", "white", 950, "UK", 85.0));
    }
}
