package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    @Override
    public List<Truck> get() {
        Truck man = new Truck();
        Truck volvo = new Truck();
        Truck mercedes = new Truck();
        return List.of(man, volvo, mercedes);
    }
}
