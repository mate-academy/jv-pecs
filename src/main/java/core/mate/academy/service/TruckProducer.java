package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    private static final Truck FIRST_TRUCK
            = new Truck("first truck", "yellow");
    private static final Truck SECOND_TRUCK
            = new Truck("second truck", "black");
    private static final Truck THIRD_TRUCK
            = new Truck("third truck", "white");

    @Override
    public List<Truck> get() {
        List<Truck> trucks = new ArrayList<>();
        trucks.add(FIRST_TRUCK);
        trucks.add(SECOND_TRUCK);
        trucks.add(THIRD_TRUCK);
        return trucks;
    }
}
