package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {

    @Override
    public List<Truck> get() {
        List<Truck> truckList = new ArrayList<>();
        truckList.add(new Truck("Ultra light"));
        truckList.add(new Truck("Heavy"));
        truckList.add(new Truck("Off-road"));
        return truckList;
    }
}
