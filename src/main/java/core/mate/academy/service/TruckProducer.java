package core.mate.academy.service;

import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Machine> {
    @Override
    public List<Machine> get() {
        List<Machine> trucks = new ArrayList<>();
        trucks.add(new Truck("Tank trucks"));
        trucks.add(new Truck("Cargo wagons"));
        trucks.add(new Truck("Grain carriers"));
        return trucks;
    }
}
