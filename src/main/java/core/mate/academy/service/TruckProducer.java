package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer extends Truck implements MachineProducer<Truck> {

    @Override
    public List<Truck> get() {
        Truck truck1 = new Truck("Grey", "Scania", 1200, "diesel");
        Truck truck2 = new Truck("Black", "Renault", 950, "patrol");
        List<Truck> truckList = new ArrayList<>();
        truckList.add(truck1);
        truckList.add(truck2);
        return truckList;
    }
}
