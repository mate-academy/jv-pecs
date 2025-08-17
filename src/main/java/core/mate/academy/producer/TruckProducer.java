package core.mate.academy.producer;

import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import core.mate.academy.service.MachineProducer;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Machine> {
    @Override
    public List<Machine> get() {
        List<Machine> list = new ArrayList<>();
        Truck truck1 = new Truck("Truck-1", 12, true, "Black");
        list.add(truck1);
        Truck truck2 = new Truck("Truck-2", 8, false, "White");
        list.add(truck2);
        return list;
    }
}
