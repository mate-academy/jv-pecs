package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    @Override
    public List<Truck> get() {
        Truck scania = new Truck("Scania", "White", 100, true, "damp");
        Truck daf = new Truck("DAF", "White", 100, true, "sami");
        Truck man = new Truck("MAN", "White", 100, true, "box");
        return List.of(scania, daf, man);
    }
}
