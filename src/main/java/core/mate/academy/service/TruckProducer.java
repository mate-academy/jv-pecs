package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    private static final int TRUCK_NUMBER = 3;
    private List<Truck> truckList;

    public TruckProducer() {
        truckList = new ArrayList<>();
    }

    @Override
    public List<Truck> get() {
        for (int i = 0; i < TRUCK_NUMBER; i++) {
            Truck truck = new Truck();
            truckList.add(i,truck);
        }
        return truckList;
    }
}
