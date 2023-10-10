package core.mate.academy.service;

import core.mate.academy.model.Truck;
import core.mate.academy.random.Colors;
import core.mate.academy.random.Models;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TruckProducer implements MachineProducer<Truck> {
    private static final int NUMBER_OF_MACHINES = 3;
    private Random random = new Random();

    @Override
    public List<Truck> get() {
        List<Truck> trucks = new ArrayList<>();

        for (int i = 0; i < NUMBER_OF_MACHINES; i++) {
            String randomName = Models.values()[random.nextInt(Models.values().length)].name();
            String randomColor = Colors.values()[random.nextInt(Colors.values().length)].name();
            double randomVolume = random.nextInt(500);
            trucks.add(new Truck(randomName, randomColor, randomVolume));
        }

        return trucks;
    }
}
