package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    private List<Truck> trucks = new ArrayList<>();

    {
        trucks.add(new Truck("Scania"));
        trucks.add(new Truck("Man"));
    }

    @Override
    public List<Truck> get() {
        return trucks;
    }
}
