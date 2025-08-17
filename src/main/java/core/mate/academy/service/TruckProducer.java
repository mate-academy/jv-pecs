package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {

    @Override
    public List<Truck> get() {
        Truck newTruck = new Truck("HG09", 20000);
        Truck oldTruck = new Truck("N001", 15000);
        List<Truck> trucks = new ArrayList<>();
        trucks.add(newTruck);
        trucks.add(oldTruck);
        return trucks;
    }
}
