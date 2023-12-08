package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    @Override
    public List<Truck> get() {
        ArrayList<Truck> trucks = new ArrayList<>();
        trucks.add(new Truck(55.5));
        trucks.add(new Truck(43.6));
        trucks.add(new Truck(77.4));
        return trucks;
    }
}
