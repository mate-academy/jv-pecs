package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    @Override
    public List<Truck> get() {
        Truck truckOne = new Truck("truck maz", "green", 2);
        Truck truckSecond = new Truck("truck kraz", "grey", 3);
        Truck truckThird = new Truck("truck zaz", "violet", 4);
        return List.of(truckOne, truckSecond, truckThird);
    }
}
