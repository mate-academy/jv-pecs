package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    private static final int MAX_NUM = 10;

    @Override
    public List<Truck> get() {
        List<Truck> list = new ArrayList<>();
        for (int i = 0; i < MAX_NUM; i++) {
            list.add(new Truck());
        }
        return list;
    }
}
