package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {

    @Override
    public List<Truck> get() {
        List<Truck> trucks = new ArrayList<>();
        trucks.add(new Truck("MAN", "blue", 200, 6));
        trucks.add(new Truck("Iveco", "green", 180, 4));
        return trucks;
    }
}
