package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    @Override
    public List<Truck> get() {
        Truck truckOne = new Truck("Oil", true, 100);
        Truck truckTwo = new Truck("Diesel", false, 200);
        Truck truckThree = new Truck("Oil", false, 300);
        List<Truck> trucks = new ArrayList<>();
        trucks.add(truckOne);
        trucks.add(truckTwo);
        trucks.add(truckThree);
        return trucks;
    }
}
