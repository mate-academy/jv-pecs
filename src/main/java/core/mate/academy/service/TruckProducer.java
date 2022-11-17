package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    @Override
    public List<Truck> get() {
        List<Truck> trucks = new ArrayList<>();
        trucks.add(new Truck(2020, "Brazil"));
        trucks.add(new Truck(2021, "Vietnam"));
        trucks.add(new Truck(2022, "France"));
        return trucks;
    }
}
