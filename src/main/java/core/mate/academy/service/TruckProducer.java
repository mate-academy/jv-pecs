package core.mate.academy.service;

import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Machine> {
    private static final int DEFAULT_SIZE = 10;
    private List<Machine> list = new ArrayList<>();

    TruckProducer() {
        truckSet();
    }

    private void truckSet() {
        for (int i = 0; i < DEFAULT_SIZE; i++) {
            list.add(new Truck());
        }
    }

    @Override
    public List<Machine> get() {
        return list;
    }
}
