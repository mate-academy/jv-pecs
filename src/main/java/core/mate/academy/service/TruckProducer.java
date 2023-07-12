package core.mate.academy.service;

import core.mate.academy.model.Truck;

import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck>{
    private static final int NUMBER_OF_CARS = 3;
    @Override
    public List<Truck> get() {
        List<Truck> trucks = new ArrayList<>();
        for (int i = 0; i < NUMBER_OF_CARS; i++) {
            trucks.add(new Truck());
        }
        return trucks;
    }
}
