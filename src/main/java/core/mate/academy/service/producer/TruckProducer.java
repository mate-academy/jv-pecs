package core.mate.academy.service.producer;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    @Override
    public List<Truck> get() {
        List<Truck> trucks = new ArrayList<>();
        trucks.add(new Truck("Truck1", "Blue", 5000, 4));
        trucks.add(new Truck("Truck2", "Blue", 6000, 6));
        trucks.add(new Truck("Truck3", "Blue", 7000, 8));
        return trucks;
    }
}
