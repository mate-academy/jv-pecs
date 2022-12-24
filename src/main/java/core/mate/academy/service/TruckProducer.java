package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer {

    @Override
    public List<Truck> get() {
        List<Truck> truckList = new ArrayList<>();
        truckList.add(new Truck("Reno", "Black", 900));
        truckList.add(new Truck("Scania", "Gold", 1000));
        truckList.add(new Truck("Daf", "Black", 1200));
        return truckList;
    }
}
