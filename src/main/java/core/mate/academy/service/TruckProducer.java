package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    @Override
    public List<Truck> get() {
        List<Truck> trucks = new ArrayList<>();
        trucks.add(new Truck("Mersedes", "silver", 40));
        trucks.add(new Truck("Volvo", "white", 42));
        trucks.add(new Truck("KrAZ", "green", 40));
        return trucks;
    }
}
