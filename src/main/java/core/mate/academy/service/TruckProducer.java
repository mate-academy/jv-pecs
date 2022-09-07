package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    @Override
    public List<Truck> get() {
        List<Truck> trucks = new ArrayList<>();
        trucks.add(new Truck("Ford", 400));
        trucks.add(new Truck("Nissan", 310));
        trucks.add(new Truck("Honda", 280));
        return trucks;
    }
}
