package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    @Override
    public List<Truck> get() {
        List<Truck> trucks = new ArrayList<>();
        trucks.add(new Truck(630, "Yool", 120.4));
        trucks.add(new Truck(780, "Bgww", 154.1));
        trucks.add(new Truck(630, "Yool", 149.2));

        return trucks;
    }
}
