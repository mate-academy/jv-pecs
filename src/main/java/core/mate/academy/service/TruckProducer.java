package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    @Override
    public List<Truck> get() {
        List<Truck> truckList = new ArrayList<>();
        truckList.add(new Truck("R245", "black", 65789));
        truckList.add(new Truck("Magnum 250", " green", 45678));
        truckList.add(new Truck("John Deere", " green", 36789));
        return truckList;
    }
}
