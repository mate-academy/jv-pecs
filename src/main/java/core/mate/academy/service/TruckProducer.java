package core.mate.academy.service;

import core.mate.academy.model.Truck;
import core.mate.academy.model.Machine;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    private static final int NUMBER_OF_VALUES = 3;
    @Override
    public List<Truck> get() {
        List<Truck> list = new ArrayList<>();
        for (int i = 0; i < NUMBER_OF_VALUES; i++) {
            list.add(new Truck());
        }
        return list;
    }
}
