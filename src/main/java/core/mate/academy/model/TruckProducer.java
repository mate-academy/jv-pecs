package core.mate.academy.model;

import core.mate.academy.service.MachineProducer;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Machine> {
    @Override
    public List<Machine> get() {
        List<Machine> truckList = new ArrayList<>();
        truckList.add(new Truck("MAZ", "blue", 120));
        truckList.add(new Truck("VAZ", "green", 130));
        truckList.add(new Truck("LAZ", "yellow", 140));
        return truckList;
    }
}
