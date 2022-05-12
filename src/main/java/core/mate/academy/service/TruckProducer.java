package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    @Override
    public List<Truck> get() {
        Truck firstTruck = new Truck("MAN", "Red");
        Truck secondTruck = new Truck("Mercedes-Benz", "blue");
        Truck thirdTruck = new Truck("Fiat", "grey");
        return List.of(firstTruck, secondTruck, thirdTruck);
    }
}
