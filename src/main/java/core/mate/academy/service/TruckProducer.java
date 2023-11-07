package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TruckProducer implements MachineProducer<Truck> {
    private static final int NUMBER_OF_UNITS = 3;
    private final Random random = new Random();
    private final String name = "SOME_NAME";
    private final String color = "SOME_COLOR";

    @Override
    public List<Truck> get() {
        List<Truck> list = new ArrayList<>();

        for (int i = 0; i < NUMBER_OF_UNITS; i++) {
            list.add(new Truck(name, color, random.nextInt(10)));
        }

        return list;
    }
}
