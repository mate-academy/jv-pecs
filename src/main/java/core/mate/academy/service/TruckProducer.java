package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer {
    @Override
    public List<Truck> get() {
        List<Truck> trucks = new ArrayList<>();
        trucks.add(new Truck("Model1", 10, 350));
        trucks.add(new Truck("Model2", 12, 450));
        trucks.add(new Truck("Model3", 14, 550));
        trucks.add(new Truck("Model4", 16, 650));
        trucks.add(new Truck("Model5", 18, 750));
        return trucks;
    }
}
