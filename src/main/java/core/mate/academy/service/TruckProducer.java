package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    @Override
    public List<Truck> get() {
        Truck truckOne = new Truck();
        Truck truckTwo = new Truck();
        Truck truckThree = new Truck();
        return List.of(truckOne, truckTwo, truckThree);
    }
}
