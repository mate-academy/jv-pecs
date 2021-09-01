package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {

    @Override
    public List<Truck> get() {
        return List.of(
                new Truck(3, true, true,
                        "Renault Magnum", "White"),
                new Truck(2, false, false,
                        "ZIL-130", "Blue"),
                new Truck(3, true, true,
                        "DAF XF", "Green"));
    }
}
