package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TruckProducer implements MachineProducer<Truck> {
    private static final int MIN_WEIGHT = 6_000;
    private static final int MAX_WEIGHT = 33_000;
    private static final int TRUCKS_AMOUNT = 5;
    private final String[] truckBodies = new String[] { "Flatbed", "Van body", "Dump", "Tipper",
            "Concrete mixer","Timber", "Tanker", "Fifth wheel", "Chassis only", "Waste body" };
    private final String[] truckCompanies = { "American Coleman", "American LaFrance",
            "Autocar Company", "Bering Trucks", "Brockway", "Crane Carrier Corporation",
            "Chevrolet", "Corbitt", "DeSoto", "Diamond T", "Dodge", "Fageol", "Ford" };
    private Random random = new Random();

    @Override
    public List<Truck> get() {
        List<Truck> trucks = new ArrayList<>();
        String bodyType; 
        String truckName;
        String truckColor;
        for (int i = 0; i < TRUCKS_AMOUNT; i++) {
            bodyType = truckBodies[random.nextInt(truckBodies.length)];
            truckName = truckCompanies[random.nextInt(truckCompanies.length)];
            truckColor = Color.values()[random.nextInt(Color.values().length)].name();
            trucks.add(new Truck(truckName, truckColor, getDouble(MIN_WEIGHT, MAX_WEIGHT),
                    bodyType));
        }
        return trucks;
    }

    private double getDouble(int min, int max) {
        return min + random.nextInt(max) + random.nextDouble();
    }
}
