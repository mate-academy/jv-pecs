package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    @Override
    public List<Truck> get() {
        Truck truckFirst = new Truck();
        Truck truckSecond = new Truck();
        Truck truckThird = new Truck();
        Truck truckFourth = new Truck();
        List<Truck> truckList = List.of(truckFirst, truckSecond, truckThird, truckFourth);
        return truckList;
    }
}
