package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    public Class<Truck> getClassName() {
        return Truck.class;
    }

    @Override
    public List<Truck> get() {
        List<Truck> list = new ArrayList<>();
        for (int i = 0; i < MACHINE_NUMBER_FOR_CREATE; i++) {
            list.add(new Truck());
        }
        return list;
    }
}
