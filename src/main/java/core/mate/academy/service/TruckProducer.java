package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    @Override
    public List<Truck> get() {
        Truck firstTruck = new Truck("Mitsubishi Minicab", "white", "conventional");
        Truck secondTruck = new Truck("Liebherr T", "blue", "cabover");
        Truck thirdTruck = new Truck("Freightliner M2", "orange", "conventional");
        return List.of(firstTruck, secondTruck,thirdTruck);
    }
}
