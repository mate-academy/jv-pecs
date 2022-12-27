package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    @Override
    public List<Truck> get() {
        Truck truckFirst = new Truck(false, 3500, "flatbed");
        Truck truckSecond = new Truck(true, 7950, "tilt");
        Truck truckThird = new Truck(false, 4800, "refrigerator");
        return List.of(truckFirst, truckSecond, truckThird);
    }
}
