package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer {

    @Override
    public List<Truck> get() {
        List<Truck> truckList = new ArrayList<>();
        truckList.add(new Truck("Mercedes", "Blue", 11, 3, 17));
        truckList.add(new Truck("Bentley", "Black", 11, 8, 13));
        truckList.add(new Truck("Zil", "aqua", 2, 1, 1791));
        return truckList;
    }
}
