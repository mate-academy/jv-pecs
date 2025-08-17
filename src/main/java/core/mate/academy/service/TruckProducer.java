package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    @Override
    public List<Truck> get() {
        List<Truck> trucks = new ArrayList<>();
        trucks.add(new Truck("TR-1", "White", 20));
        trucks.add(new Truck("TR-2", "Black", 30));
        trucks.add(new Truck("TR-3", "Red", 25));
        return trucks;
    }
}
