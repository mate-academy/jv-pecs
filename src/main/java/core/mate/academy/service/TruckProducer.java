package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    @Override
    public List<Truck> get() {
        Truck volvo = new Truck("Volvo", "Red", 120, true, "flatbed");
        Truck mercedes = new Truck("Mercedes", "Blue", 150, true, "refrigerator");
        Truck iveco = new Truck("Iveco", "Green", 80, false, "tanker");
        return List.of(volvo, mercedes, iveco);
    }
}
