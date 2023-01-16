package core.mate.academy.service;

import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import java.util.List;

public class TruckProducer implements MachineProducer<Machine> {
    @Override
    public List<Machine> get() {
        Truck truck1 = new Truck(121, "MAN");
        Truck truck2 = new Truck(140,"ZIL");
        Truck truck3 = new Truck(170,"VOLVO");
        return List.of(truck1,truck2,truck3);
    }
}
