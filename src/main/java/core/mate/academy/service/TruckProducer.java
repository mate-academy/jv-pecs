package core.mate.academy.service;

import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Machine> {
    @Override
    public List<Machine> get() {
        List<Machine> trucks = new ArrayList<>();
        trucks.add(new Truck("Truck First", "White", 2, 12.1));
        trucks.add(new Truck("Truck Second", "Yellow", 2, 12.5));
        trucks.add(new Truck("Truck Third", "Blue", 3, 15.0));
        return trucks;
    }
}
