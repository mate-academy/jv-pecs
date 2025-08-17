package core.mate.academy.producer;

import core.mate.academy.model.Truck;
import core.mate.academy.util.RandomTruncateNumberGenerator;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    private final RandomTruncateNumberGenerator generator;

    public TruckProducer() {
        generator = new RandomTruncateNumberGenerator();
    }

    @Override
    public List<Truck> get() {
        List<Truck> truckList = new ArrayList<>();
        truckList.add(new Truck(generator.generateRandomDouble(),
                generator.generateRandomDouble(),
                generator.generateRandomDouble()));
        truckList.add(new Truck(generator.generateRandomDouble(),
                generator.generateRandomDouble(),
                generator.generateRandomDouble()));
        truckList.add(new Truck(generator.generateRandomDouble(),
                generator.generateRandomDouble(),
                generator.generateRandomDouble()
        ));
        return truckList;
    }
}
