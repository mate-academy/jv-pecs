package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {

    @Override
    public List<Truck> get() {
        List<Truck> trucks = new ArrayList<>();
        trucks.add(new Truck("Kamaz", "Orange", 5));
        trucks.add(new Truck("Maz", "White", 4));
        trucks.add(new Truck("Man", "Black", 6));
        trucks.add(new Truck("Daf", "White", 3));
        return trucks;
    }
}
