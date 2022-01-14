package core.mate.academy.service.producer;

import core.mate.academy.model.Truck;
import core.mate.academy.service.MachineProducer;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    @Override
    public List<Truck> get() {
        Truck komatsuTruck = new Truck("HD325-8", "yellow", "Box-sectioned structure",
                36500, 16.9, 68);
        Truck shantuiTruck = new Truck("MT3900", "yellow", "High strength steel flexible frame",
                60000, 32, 43);
        Truck shantuiTruckMT = new Truck("MT3A00", "yellow", "High strength steel flexible frame",
                68000, 38, 43);
        return List.of(komatsuTruck, shantuiTruck, shantuiTruckMT);
    }
}
