package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    @Override
    public List<Truck> get() {
        List<Truck> trucks = new ArrayList<>();
        trucks.add(new Truck(2, "Flatbed", 5000));
        trucks.add(new Truck(3, "Refrigerator", 8000));
        trucks.add(new Truck(4, "Box Truck", 12000));
        return trucks;
    }
}
