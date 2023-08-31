package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    @Override
    public List<Truck> get() {
        List<Truck> truckList = new ArrayList<>();
        truckList.add(new Truck("R245", "black", 65789, " gasoline"));
        truckList.add(new Truck("Magnum 250", " green", 45678, "gas"));
        truckList.add(new Truck("John Deere", " green", 36789, " diesel"));
        return truckList;
    }
}
