package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    private List<Truck> trucks;

    public TruckProducer() {
        trucks = new ArrayList<>();
    }

    @Override
    public List<Truck> get() {
        trucks.add(Truck.of(1000, 220));
        trucks.add(Truck.of(2200, 210));
        return trucks;
    }
}
