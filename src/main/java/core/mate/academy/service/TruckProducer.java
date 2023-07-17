package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    private static final Truck first = new Truck();
    private static final Truck second = new Truck();
    private static final Truck third = new Truck();

    @Override
    public List<Truck> get() {
        return List.of(first, second, third);
    }
}
