package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    @Override
    public List<Truck> get() {
        Truck firstTruck = new Truck(4000, 80, 115);
        firstTruck.setName("Truck1");
        firstTruck.setColor("White");
        Truck secondTruck = new Truck(6000, 90, 150);
        secondTruck.setName("Truck2");
        secondTruck.setColor("Orange");
        return List.of(firstTruck, secondTruck);
    }
}
