package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TruckProducer implements MachineProducer<Truck> {
    private static final int NUM_OF_EXCAVATOR = 3;
    private List<Truck> list = new ArrayList<>();

    public TruckProducer() {
        Random random = new Random();

        for (int i = 0; i < NUM_OF_EXCAVATOR; i++) {
            list.add(new Truck(random.nextDouble(5)));
        }

    }

    public TruckProducer(List<Truck> list) {
        this.list = list;
    }

    @Override
    public List<Truck> get() {
        return list;
    }
}
