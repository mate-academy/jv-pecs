package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {

    @Override
    public List<Truck> get() {
        Truck one = new Truck("one", 1, 1.1);
        Truck two = new Truck("two", 2, 2.2);
        Truck three = new Truck("three", 3, 3.3);
        return List.of(one, two, three);
    }
}
