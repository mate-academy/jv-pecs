package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {

    @Override
    public List<Truck> get() {
        Truck truckOne = new Truck("GMC", "White");
        Truck truckTwo = new Truck("MACK", "Black");
        Truck truckTree = new Truck("Ford", "Red");
        List<Truck> trucksList = new ArrayList<>();
        trucksList.add(truckOne);
        trucksList.add(truckTwo);
        trucksList.add(truckTree);
        return trucksList;
    }
}
