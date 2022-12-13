package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.List;

public class TruckProducer extends Truck {
    List<? extends Truck> get() {
        return List.of(new Truck(), new Truck(), new Truck());
    }
}
