package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.List;

public class TruckProducer<T extends Truck> implements MachineProducer<T> {

    @Override
    public List<T> get() {
        return (List<T>) List.of(new Truck(), new Truck(), new Truck());
    }
}
