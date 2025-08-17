package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    private static final int NUMBER = 2;

    private List<Truck> list;

    public TruckProducer() {
        list = new ArrayList<>(
                Collections.nCopies(NUMBER, new Truck())
        );
    }

    @Override
    public List<Truck> get() {
        return list;
    }
}
