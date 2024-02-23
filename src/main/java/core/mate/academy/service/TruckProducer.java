package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    @Override
    public List<Truck> get() {
        List<Truck> trucks = new ArrayList<>();
        trucks.add(new Truck("Box truck", "1.5 tonne", 1.400));
        trucks.add(new Truck("Refrigerator truck", "5 tonne", 1.800));
        return trucks;
    }
}
