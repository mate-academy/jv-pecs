package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer {

    @Override
    public List<Truck> get() {
        List<Truck> trucks = new ArrayList<>();
        trucks.add(new Truck("Belaz", "Grey", 100));
        trucks.add(new Truck("Tata", "Red", 20));
        trucks.add(new Truck("Mahinda", "Green", 43));
        return trucks;
    }
}
