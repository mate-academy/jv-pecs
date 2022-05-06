package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {

    @Override
    public List<Truck> get() {
        List<Truck> trucks = new ArrayList<>();
        Truck firstTruck = new Truck();
        firstTruck.setNumberOfWheels(6);
        Truck secondTruck = new Truck();
        secondTruck.setNumberOfWheels(8);
        trucks.add(firstTruck);
        trucks.add(secondTruck);
        return trucks;
    }
}
