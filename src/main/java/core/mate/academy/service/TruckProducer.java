package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    @Override
    public List<Truck> get() {
        Truck firstTruck = new Truck("firstTruck", "Red", 650);
        Truck secondTruck = new Truck("secondTruck", "Black", 500);
        Truck thirdTruck = new Truck("thirdTrick", "White", 560);
        return List.of(firstTruck, secondTruck, thirdTruck);
    }
}
