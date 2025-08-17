package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {

    @Override
    public List<Truck> get() {
        List<Truck> trucks = new ArrayList<>();
        trucks.add(new Truck("Truckozavr", " black", 12));
        trucks.add(new Truck("Clop", "Blue", 10));
        trucks.add(new Truck("Mini", "Yellow", 6));
        return trucks;
    }
}
