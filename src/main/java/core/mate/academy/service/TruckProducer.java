package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer<T extends Truck> implements MachineProducer<T> {
    @Override
    public List<Truck> get() {
        List<Truck> trucks = new ArrayList<>();
        trucks.add(new Truck("Man", "white", "Very light"));
        trucks.add(new Truck("Volvo", "black", "Medium"));
        trucks.add(new Truck("Scania", "brown", "Heavy"));
        return trucks;
    }
}
