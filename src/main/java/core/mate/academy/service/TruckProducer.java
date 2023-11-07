package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    private static final Truck firstTruck = new Truck();
    private static final Truck secondTruck = new Truck();
    private static final Truck thirdTruck = new Truck();

    @Override
    public List<Truck> get() {
        return List.of(firstTruck, secondTruck, thirdTruck);
    }
}
