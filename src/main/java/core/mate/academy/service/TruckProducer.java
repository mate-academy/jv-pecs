package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.List;

public class TruckProducer implements MachineProducer {
    private Truck truck1 = new Truck(3, true, true,
            "Renault Magnum", "White");
    private Truck truck2 = new Truck(2, false, false,
            "ZIL-130", "Blue");
    private Truck truck3 = new Truck(3, true, true,
            "DAF XF", "Green");

    @Override
    public List<Truck> get() {
        return List.of(truck1, truck2, truck3);
    }
}