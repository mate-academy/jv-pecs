package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    private final Truck truck0 = new Truck();
    private final Truck truck1 = new Truck(true, true, 3);
    private final Truck truck2 = new Truck(false, false, 4);

    @Override
    public List<Truck> get() {
        return List.of(truck0, truck1, truck2);
    }
}
