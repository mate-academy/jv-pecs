package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    @Override
    public List<Truck> get() {
        Truck truckFirst = new Truck("truckFirst", "yellow", "Refrigerator");
        Truck truckSecond = new Truck("truckSecond", "green", "Tanker");
        Truck truckThird = new Truck("excavatorThird", "blue", "Grain");
        return List.of(truckFirst, truckSecond, truckThird);
    }
}
