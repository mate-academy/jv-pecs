package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {

    @Override
    public List<Truck> get() {
        List<Truck> machines = new ArrayList<>();
        machines.add(new Truck("Grey", "Mercedes", 15000));
        machines.add(new Truck("White", "Scania", 17000));
        machines.add(new Truck("Black", "DAF", 20000));
        return machines;
    }
}
