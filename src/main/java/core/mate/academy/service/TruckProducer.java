package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    private List<Truck> truckList;

    public TruckProducer() {
        truckList = new ArrayList<>();
        truckList.add(new Truck("Flash", "Yellow"));
        truckList.add(new Truck("Space", "Black"));
        truckList.add(new Truck("Robot", "Blue"));
    }

    @Override
    public List<Truck> get() {
        return truckList;
    }
}
