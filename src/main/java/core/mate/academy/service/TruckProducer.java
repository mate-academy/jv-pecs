package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {

    @Override
    public List<Truck> get() {
        List<Truck> trucks = new ArrayList<>();
        trucks.add(new Truck("newTruck", "Red", 100));
        trucks.add(new Truck("oldTruck", "Black", 150));
        trucks.add(new Truck("mainTruck", "Yellow", 200));
        return trucks;
    }
}
