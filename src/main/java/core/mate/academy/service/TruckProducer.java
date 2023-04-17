package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    private Truck volvo = new Truck();
    private Truck man = new Truck();

    @Override
    public List<Truck> get() {
        return List.of(volvo, man);
    }
}
