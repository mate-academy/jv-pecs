package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    @Override
    public List<Truck> get() {
        List<Truck> trucks = new ArrayList<>();
        trucks.add(new Truck("first truck", "yellow"));
        trucks.add(new Truck("second truck", "black"));
        trucks.add(new Truck("third truck", "white"));
        return trucks;
    }
}
