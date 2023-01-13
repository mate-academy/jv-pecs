package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    private final Truck truck = new Truck();
    private final Truck truck2 = new Truck(true, false, 0, "White");
    private final Truck truck3 = new Truck(true, true, 65, "Black");
    private final Truck truck4 = new Truck(false, true, 75, "Grey");

    @Override
    public List<Truck> get() {
        return List.of(truck, truck2, truck3, truck4);
    }
}
