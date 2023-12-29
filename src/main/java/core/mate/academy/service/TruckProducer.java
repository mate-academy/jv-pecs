package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {

    @Override
    public List<Truck> get() {
        Truck volvoTruck = new Truck(true);
        Truck mercedesTruck = new Truck(false);
        return List.of(volvoTruck, mercedesTruck);
    }
}
