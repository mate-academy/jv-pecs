package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    @Override
    public List<Truck> get() {
        Truck fullTruck = new Truck();
        Truck emptyTruck = new Truck();
        fullTruck.setFuelBalance(100);
        emptyTruck.setFuelBalance(0);
        List<Truck> truckList = List.of(fullTruck, emptyTruck);
        return truckList;
    }
}
