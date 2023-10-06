package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    private static final int TRUCK_COUNT = 3;

    @Override
    public List<Truck> get() {
        List<Truck> listOfTrucks = new ArrayList<>();
        for (int i = 0; i < TRUCK_COUNT; i++) {
            listOfTrucks.add(new Truck("Track", "Red", 8, 110));
        }
        return listOfTrucks;
    }
}
