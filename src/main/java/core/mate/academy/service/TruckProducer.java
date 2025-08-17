package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    private static final int AMOUNT_TO_CREATE = 3;

    @Override
    public List<Truck> get() {
        List<Truck> list = new ArrayList<>();
        for (int i = 0; i < AMOUNT_TO_CREATE; i++) {
            list.add(new Truck());
        }
        return list;
    }
}
