package core.mate.academy.model;

import core.mate.academy.service.MachineProducer;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    @Override
    public List<Truck> get() {
        List<Truck> truckList = new ArrayList<>();
        truckList.add(new Truck("MAZ", "blue", 120));
        truckList.add(new Truck("VAZ", "green", 130));
        truckList.add(new Truck("LAZ", "yellow", 140));
        return truckList;
    }
}
