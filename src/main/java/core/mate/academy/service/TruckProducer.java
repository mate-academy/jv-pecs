package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TruckProducer implements MachineProducer<Truck> {
    private static final int MAX_TRUCK_SPEED = 140;

    @Override
    public List<Truck> get() {
        Random random = new Random();
        List<Truck> truckList = new ArrayList<>();
        for (int i = 0; i < MODELS_AMOUNT; i++) {
            truckList.add(new Truck(random.nextInt(MAX_TRUCK_SPEED), random.nextBoolean()));
        }
        return truckList;
    }
}
