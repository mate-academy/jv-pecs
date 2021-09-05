package core.mate.academy.service;

import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Machine> {

    @Override
    public List<Machine> get() {
        List<Machine> trucks = new ArrayList<>();
        trucks.add(new Truck("DAF", "Yellow", 3, 5));
        trucks.add(new Truck("MAN", "Red", 1, 2));
        trucks.add(new Truck("Renault", "Grin", 2, 4));
        trucks.add(new Truck("Scania", "Grey", 3, 4));
        return trucks;
    }
}
