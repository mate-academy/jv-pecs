package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {

    @Override
    public List<Truck> get() {
        List<Truck> trucks = new ArrayList<>();
        Collections.addAll(trucks,
                new Truck("Titan", "Blue", "Titan-XL", 25),
                new Truck("Storm", "Red", "StormTruck-5000", 30),
                new Truck("Silver", "Yellow", "Falcon Hauler", 35));
        return trucks;
    }
}
