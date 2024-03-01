package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    @Override
    public List<Truck> get() {
        List<Truck> trucks = new ArrayList<>();
        trucks.add(new Truck("red", "Ford Maverick",
                1800, "pickup"));
        trucks.add(new Truck("white", "Mack Anthem",
                28_000, "semi-tractor"));
        return trucks;
    }
}
