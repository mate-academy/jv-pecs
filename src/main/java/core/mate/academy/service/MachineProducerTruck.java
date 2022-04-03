package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class MachineProducerTruck implements MachineProducer<Truck> {
    @Override
    public List<Truck> get() {
        List<Truck> truckList = new ArrayList<>();
        Truck truck1 = new Truck("June", "yellow", 2018, "Japanese");
        Truck truck2 = new Truck("August", "red", 1990, "Poland");

        truckList.add(truck1);
        truckList.add(truck2);

        return truckList;
    }
}
