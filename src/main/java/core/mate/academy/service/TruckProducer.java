package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    @Override
    public List<Truck> get() {
        List<Truck> trucks = new ArrayList<>();
        trucks.add(new Truck("MAN", "White", 25));
        trucks.add(new Truck("VOLVO", "Black", 17));
        trucks.add(new Truck("RENAULT", "Red", 36));
        return trucks;
    }
}
