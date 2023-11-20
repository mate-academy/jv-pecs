package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    private static final int NUMBER_OF_MACHINES = 3;
    private Truck truck = new Truck();

    @Override
    public List<Truck> get() {
        List<Truck> trucks = new ArrayList<>();

        for (int i = 0; i < NUMBER_OF_MACHINES; i++) {
            String randomName = truck.getRandomName();
            String randomColor = truck.getRandomColor();
            double randomVolume = truck.getRandomTrailerVolume();
            trucks.add(new Truck(randomName, randomColor, randomVolume));
        }

        return trucks;
    }
}
