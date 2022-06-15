package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    @Override
    public List<Truck> get() {
        return new ArrayList<>(Arrays.asList(new Truck("Truck1", "blue", 123),
                new Truck("Truck2", "white", 567),
                new Truck("Truck3", "black", 787)));
    }
}
