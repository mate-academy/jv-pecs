package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Truck;

import java.util.ArrayList;
import java.util.List;

public class TruckProducerImpl<M> implements MachineProducer<M> {
    @Override
    public List<M> get() {
        List<M> bulldozers = new ArrayList<>();
        for (int i = 0; i < MACHINE_QUANTITY; i++) {
            bulldozers.add((M) new Truck());
        }
        return bulldozers;
    }
}
