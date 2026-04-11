package core.mate.academy.service;

import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import java.util.LinkedList;
import java.util.List;

public interface TruckProducer extends MachineProducer {
    @Override
    default List<? extends Machine> get() {
        List<Truck> lsTruck = new LinkedList<>();
        Truck truck1 = new Truck();
        Truck truck2 = new Truck();
        Truck truck3 = new Truck();
        lsTruck.add(truck1);
        lsTruck.add(truck2);
        lsTruck.add(truck3);

        return lsTruck;
    }
}
