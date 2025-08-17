package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    private static final int MACHINE_NUMBER = 3;

    public List<Truck> get() {
        List<Truck> list = new ArrayList<>();
        for (int i = 0; i <= MACHINE_NUMBER; i++) {
            Truck truck = new Truck();
            list.add(truck);
        }
        return list;
    }
}
