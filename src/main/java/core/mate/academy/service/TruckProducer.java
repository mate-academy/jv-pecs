package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer extends Truck implements MachineProducer<Truck> {
    @Override
    public List<Truck> get() {
        List<Truck> truckList = new ArrayList<>();
        truckList.add(new Truck("Grey", "Scania", 1200, "diesel"));
        truckList.add(new Truck("Black", "Renault", 950, "patrol"));
        return truckList;
    }
}
