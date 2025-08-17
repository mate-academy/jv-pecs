package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.Arrays;
import java.util.List;

public class TruckProducerImpl implements MachineProducer<Truck> {
    private Truck[] models = {
            new Truck("Nissan", 20),
            new Truck("Ford", 30),
            new Truck("Ram", 40)
    };

    @Override
    public List<Truck> get() {
        return Arrays.asList(models);
    }
}
