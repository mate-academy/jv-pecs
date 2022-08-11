package core.mate.academy.service;

import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import java.util.LinkedList;
import java.util.List;

public class TruckProducer implements MachineProducer {

    @Override
    public List<? extends Machine> get() {
        Truck truck = new Truck();
        Truck truck1 = new Truck();
        truck.setKindOfFuel("hybrid");
        truck1.setLength(12);
        List<Truck> trucks = new LinkedList<>();
        trucks.add(truck);
        trucks.add(truck1);
        return trucks;
    }
}
