package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    @Override
    public List<Truck> get() {
        Truck volvoTruck = new Truck("Volvo", 12, "gas");
        Truck renaultTruck = new Truck("Renault", 10, "diesel");
        Truck mitsubishiTruck = new Truck("Mitsubishi", 12, "diesel");
        return List.of(volvoTruck, renaultTruck, mitsubishiTruck);
    }
}
