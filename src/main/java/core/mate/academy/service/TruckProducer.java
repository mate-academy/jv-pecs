package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer {
    @Override
    public List<Truck> get() {
        List<Truck> trucks = new ArrayList<>();
        trucks.add(new Truck("firstTruck", "black", 100));
        trucks.add(new Truck("secondTruck", "blue", 120));
        trucks.add(new Truck("thirdTruck", "white", 150));

        return trucks;
    }
}
