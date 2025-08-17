package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class MachineProducerTruck implements MachineProducer<Truck> {
    @Override
    public List<Truck> get() {
        List<Truck> trucks = new ArrayList<>();
        trucks.add(new Truck("T150", "blue", 150));
        trucks.add(new Truck("DT75", "grey", 75));
        trucks.add(new Truck("T55", "yellow", 50));
        return trucks;
    }
}
