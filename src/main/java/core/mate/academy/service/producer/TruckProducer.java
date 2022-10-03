package core.mate.academy.service.producer;

import core.mate.academy.model.Truck;
import core.mate.academy.service.MachineProducer;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    @Override
    public List<Truck> get() {
        Truck peterbilt579 = new Truck("579", "red",
                140, 40_000, "TMC");
        Truck peterbilt389X = new Truck("389X", "black",
                145, 45_000, "TMC");
        Truck peterbilt389 = new Truck("389", "red",
                145, 45_000, "TMC");
        return List.of(peterbilt389, peterbilt389X, peterbilt579);
    }
}
