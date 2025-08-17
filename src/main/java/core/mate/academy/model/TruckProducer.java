package core.mate.academy.model;

import core.mate.academy.service.MachineProducer;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {

    @Override
    public List<Truck> get() {
        Truck volvo = new Truck("Volvo CR900", "Blue", 2000,
                "diesel");
        Truck man = new Truck("Man RY200", "Black", 1900, "diesel");
        return List.of(volvo, man);
    }
}
