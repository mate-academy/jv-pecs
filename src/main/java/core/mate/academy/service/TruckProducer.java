package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    @Override
    public List<Truck> get() {
        ArrayList<Truck> machines = new ArrayList<>();
        machines.add(new Truck());
        machines.add(new Truck());
        machines.add(new Truck());
        return machines;
    }
}
