package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    private final Truck volvo = new Truck();
    private final Truck freightliner = new Truck();
    private final Truck peterbilt = new Truck();

    @Override
    public List<Truck> get() {
        return List.of(volvo, freightliner, peterbilt);
    }
}
