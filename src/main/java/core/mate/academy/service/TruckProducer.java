package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Truck;

import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer {
    private static final int NUMBER_OF_MODELS = 3;
    @Override
    public List<Truck> get() {
        List<Truck> truckList = new ArrayList<>();
        for (int i = 0; i < NUMBER_OF_MODELS; i++) {
            truckList.add(new Truck());
        }
        return truckList;
    }
}
