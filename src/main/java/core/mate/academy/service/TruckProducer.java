package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.List;

public class TruckProducer implements MachineProducer {
    @Override
    public List<Truck> get() {
        Truck truckFirst = new Truck("Black", "truckFirst");
        Truck truckSecond = new Truck("Black", "truckSecond");
        return List.of(truckFirst, truckSecond);
    }
}
