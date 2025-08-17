package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    @Override
    public List<Truck> get() {
        List<Truck> trucks = new ArrayList<>();
        trucks.add(new Truck("Disel fuel", "Lada"));
        trucks.add(new Truck("Petrol", "GAZ"));
        trucks.add(new Truck("Petrol", "MUCK"));
        return trucks;
    }
}
