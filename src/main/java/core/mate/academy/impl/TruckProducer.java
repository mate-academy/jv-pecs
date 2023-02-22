package core.mate.academy.impl;

import core.mate.academy.model.Truck;
import core.mate.academy.service.MachineProducer;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer {

    private List<Truck> truckList = new ArrayList<>();

    @Override
    public List get() {
        truckList.add(new Truck("truck1", "white", "dump truck"));
        truckList.add(new Truck("truck2", "orange", "car carriers"));
        truckList.add(new Truck("truck3", "brown", "tanker"));
        return truckList;
    }
}
