package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    @Override
    public List<Truck> get() {
        List<Truck> truckList = new ArrayList<>();
        truckList.add(new Truck("TRUCK2000", "blue", 2000));
        truckList.add(new Truck("TRUCK3000", "red", 2000));
        truckList.add(new Truck("TRUCK4000", "green", 2000));
        return truckList;
    }
}
