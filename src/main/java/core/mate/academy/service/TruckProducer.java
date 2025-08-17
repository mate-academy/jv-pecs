package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.List;

public class TruckProducer implements MachineProducer {

    @Override
    public List<Truck> get() {
        Truck firstTruck = new Truck(550, "Volvo", 1100);
        Truck secondTruck = new Truck(890, "Ford", 2000);
        Truck thirdTruck = new Truck(740, "Hyundai", 1600);
        return List.of(firstTruck, secondTruck, thirdTruck);
    }
}
