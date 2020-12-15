package core.mate.academy.model;

import core.mate.academy.service.MachineProducer;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    @Override
    public List<Truck> get() {
        List<Truck> trucks = new ArrayList<>();
        Truck first = new Truck();
        Truck second = new Truck();
        Truck third = new Truck();
        trucks.add(first);
        trucks.add(second);
        trucks.add(third);
        return trucks;
    }
}
