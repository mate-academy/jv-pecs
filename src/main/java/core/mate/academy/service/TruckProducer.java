package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {

    @Override
    public List<Truck> get() {
        return List.of(new Truck("BrutallyKiller", "Red", 10, 400),
                new Truck("LongTraveler", "Blue", 8, 280),
                new Truck("PureLady", "Pink", 6, 200));
    }
}
