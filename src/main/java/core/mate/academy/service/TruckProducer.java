package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {

    @Override
    public List<Truck> get() {
        List<Truck> trucks = new ArrayList<>();
        trucks.add(new Truck("Komatsu", "yellow", 369.4));
        trucks.add(new Truck("Liebherr", "yellow", 363.0));
        trucks.add(new Truck("Hitachi", "orange", 296.0));
        return trucks;
    }
}
