package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {

    private Truck firstTruck = new Truck("Heavy transport", "White", 40, false);
    private Truck secondTruck = new Truck("Tube transport", "Red", 20, true);
    private Truck thirdTruck = new Truck("Pillar transport", "Black", 40, false);

    @Override
    public List get() {
        return List.of(firstTruck, secondTruck, thirdTruck);
    }
}
