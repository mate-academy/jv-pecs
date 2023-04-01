package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {

    @Override
    public List<Truck> get() {
        Truck firstTruck = new Truck("firstTruck", "Red", 102);
        Truck secondTruck = new Truck("secondTruck", "Black", 202);
        Truck thirdTruck = new Truck("thirdTrick", "White", 302);
        return List.of(firstTruck, secondTruck, thirdTruck);
    }
}
