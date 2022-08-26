package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    @Override
    public List<Truck> get() {
        List<Truck> trucks = new ArrayList<>();
        for (int i = 1; i <= NUMBER_OF_MACHINES; i++) {
            trucks.add(new Truck(i, String.valueOf(i), i % 2 == 0));
        }
        return trucks;
    }
}
