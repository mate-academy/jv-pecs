package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    private List<Truck> trucks = new ArrayList<>();

    @Override
    public List<Truck> get() {
        trucks.add(new Truck(2, "Family truck"));
        trucks.add(new Truck(3, "Working truck"));
        trucks.add(new Truck(4, "Real big truck"));
        return trucks;
    }
}
