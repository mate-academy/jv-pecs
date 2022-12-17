package core.mate.academy.service;

import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Machine> {
    @Override
    public List<? extends Machine> get() {
        List<Truck> list = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            list.add(new Truck());
        }
        return list;
    }
}
