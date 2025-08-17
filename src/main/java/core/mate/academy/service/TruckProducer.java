package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer {

    @Override
    public List<Truck> get() {
        Truck smallTruck = new Truck("smallTruck", "yellow", 1000);
        Truck middleTruck = new Truck("middleTruck", "blue", 2000);
        Truck bigTruck = new Truck("bigTruck", "green", 3000);
        ArrayList<Truck> trucks = new ArrayList<>();
        trucks.add(smallTruck);
        trucks.add(middleTruck);
        trucks.add(bigTruck);
        return trucks;
    }
}
