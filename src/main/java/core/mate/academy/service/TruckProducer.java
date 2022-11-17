package core.mate.academy.service;

import core.mate.academy.model.Truck;

import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    @Override
    public List<Truck> get() {
        List<Truck> trucks = new ArrayList<>();
        trucks.add(new Truck(2020, "Sambo"));
        trucks.add(new Truck(2021, "Brien"));
        trucks.add(new Truck(2022, "Kärcher"));
        return trucks;
    }
}
