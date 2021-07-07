package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {

    @Override
    public List<Truck> get() {
        List<Truck> truckList = new ArrayList<>();
        truckList.add(new Truck("truckFirst", "Green", 10));
        truckList.add(new Truck("truckSecond", "Blue", 12));
        truckList.add(new Truck("truckThird", "Orange", 8));
        return truckList;
    }
}
