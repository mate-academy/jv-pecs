package core.mate.academy.producers;

import core.mate.academy.model.Truck;
import java.util.List;

public class TruckProducer implements MachineProducer {
    @Override
    public List<Truck> get() {
        Truck truck1 = new Truck("volvo", "pink", "yellow", 1567);
        Truck truck2 = new Truck("man", "green", "red", 65412);
        Truck truck3 = new Truck("iveco", "brown", "aquamarine", 987);
        return List.of(truck1, truck2, truck3);
    }
}
