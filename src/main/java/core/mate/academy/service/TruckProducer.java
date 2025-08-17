package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    public static final int SIZE_OF_LIST = 5;

    @Override
    public List<Truck> get() {
        List<Truck> list = new ArrayList<>();
        for (int i = 0; i < SIZE_OF_LIST; i++) {
            list.add(new Truck());
        }
        return list;
    }
}
