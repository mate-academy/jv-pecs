package core.mate.academy.machine.impl;

import core.mate.academy.model.Truck;
import core.mate.academy.service.MachineProducer;
import java.util.ArrayList;
import java.util.List;

public class TruckProducerImpl implements MachineProducer<Truck> {
    @Override
    public List<Truck> get() {
        List<Truck> truckList = new ArrayList<>();

        truckList.add(new Truck("Truck1", "Red", 1));
        truckList.add(new Truck("Truck2", "White", 2));
        truckList.add(new Truck("Truck3", "Black", 3));
        truckList.add(new Truck("Truck4", "Orange", 4));
        truckList.add(new Truck("Truck5", "Green", 5));

        return truckList;
    }
}
