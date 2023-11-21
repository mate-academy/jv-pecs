package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    @Override
    public List<Truck> get() {
        Truck firstTruck = new Truck("MAN", "Red", "960-litres");
        Truck secondTruck = new Truck("Mercedes-Benz", "blue", "1340-litres");
        Truck thirdTruck = new Truck("Fiat", "grey", "760-litres");
        return List.of(firstTruck, secondTruck, thirdTruck);
    }
}
