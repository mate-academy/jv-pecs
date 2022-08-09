package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    private List<Truck> truckList;

    public TruckProducer() {
        truckList = new ArrayList<>();
        truckList.add(new Truck("truck1", "yellow"));
        truckList.add(new Truck("truck2", "red"));
        truckList.add(new Truck("truck3", "black"));
    }

    @Override
    public List<Truck> get() {
        return truckList;
    }
}
