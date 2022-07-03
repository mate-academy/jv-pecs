package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {

    @Override
    public List<Truck> get() {
        List<Truck> trucks = new ArrayList<>();
        trucks.add(new Truck("firstTruck", "White", 80));
        trucks.add(new Truck("secondTruck", "Pink", 100));
        trucks.add(new Truck("thirdTruck", "Yellow", 120));
        return trucks;
    }
}
