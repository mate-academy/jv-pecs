package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    @Override
    public List<Truck> get() {
        return List.of(new Truck("CAT", "Yellow", 6_000, true),
                new Truck("Garlic", "White", 5_400, false),
                new Truck("Mikro", "Blue", 5_850, true));
    }
}
