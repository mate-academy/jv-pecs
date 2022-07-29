package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {

    @Override
    public List<Truck> get() {
        Truck man = Truck.create("Man", "white",
                90,4,30.5);
        Truck ford = Truck.create("Ford", "gray",
                110, 3, 25.4);
        Truck mercedes = Truck.create("Mercedes", "black",
                95, 4, 32.3);
        return List.of(man, ford, mercedes);
    }
}
