package core.mate.academy.service;

import core.mate.academy.model.Truck;

import java.util.ArrayList;
import java.util.List;

public class TruckProducerImpl implements MachineProducer<Truck> {
    @Override
    public List<Truck> get() {
        List<Truck> truckList = new ArrayList<>();
        Truck truck1 = new Truck("Volvo G20", "Red", 10, 7000.0);
        truckList.add(truck1);
        Truck truck2 = new Truck("Volvo G30", "Black", 14, 11000.0);
        truckList.add(truck2);
        Truck truck3 = new Truck("Volvo G5", "Yellow", 8, 4500.0);
        truckList.add(truck3);
        return truckList;
    }
}
