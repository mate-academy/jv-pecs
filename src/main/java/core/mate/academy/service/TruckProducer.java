package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.Arrays;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    @Override
    public List<Truck> get() {
        Truck truck1 = new Truck();
        truck1.setLoadCapacity(100);

        Truck truck2 = new Truck();
        truck2.setLoadCapacity(150);

        return Arrays.asList(truck1, truck2);
    }
}
