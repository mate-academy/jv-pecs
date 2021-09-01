package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    @Override
    public List<Truck> get() {
        List<Truck> truckList = new ArrayList<>();
        truckList.add(new Truck("First truck", "white", 2001));
        truckList.add(new Truck("Second truck", "blue", 2002));
        truckList.add(new Truck("Second truck", "red", 2003));
        return truckList;
    }
}
