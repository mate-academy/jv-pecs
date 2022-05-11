package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.List;

public class TruckProduser implements MachineProducer<Truck> {
    @Override
    public List<Truck> get() {
        Truck firstTruck = new Truck("Red", "MAN");
        Truck secondTruck = new Truck("Mercedes-Benz", "blue");
        Truck thirdTruck = new Truck("Fiat", "grey");
        return List.of(firstTruck, secondTruck, thirdTruck);
    }
}
