package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    @Override
    public List<Truck> get() {
        List<Truck> trucks = new ArrayList<>();
        trucks.add(new Truck("Toyota", "Black", 8, "Spring", "Triple"));
        trucks.add(new Truck("Mazda", "Purple", 8, "Spring", "Triple"));
        trucks.add(new Truck("Renault", "Violet", 8, "Spring", "Triple"));
        return trucks;
    }
}
