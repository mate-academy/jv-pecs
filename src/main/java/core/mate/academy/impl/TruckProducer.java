package core.mate.academy.impl;

import core.mate.academy.model.Truck;
import core.mate.academy.service.MachineProducer;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {

    @Override
    public List<Truck> get() {
        ArrayList<Truck> machines = new ArrayList<>();
        machines.add(new Truck());
        machines.add(new Truck());

        return machines;
    }
}
