package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TruckProducer implements MachineProducer<Truck> {
    private static final int MIN_WEIGHT = 6_000;
    private static final int MAX_WEIGHT = 33_000;
    private static final int NUMBER = 5;
    private final String[] truckBodies = new String[] { "Flatbed", "Van body", "Dump",
            "Tipper", "Concrete mixer","Timber", "Tanker", "Fifth wheel", "Chassis only",
            "Waste body" };
    private Random random = new Random();

    @Override
    public List<Truck> get() {
        List<Truck> trucks = new ArrayList<>();
        String bodyType;
        for (int i = 0; i < NUMBER; i++) {
            bodyType = truckBodies[random.nextInt(truckBodies.length)];
            trucks.add(new Truck(getDouble(MIN_WEIGHT, MAX_WEIGHT), bodyType));
        }
        return trucks;
    }
    
    private double getDouble(int min, int max) {
        return min + random.nextInt(max) + random.nextDouble();
    }
}
