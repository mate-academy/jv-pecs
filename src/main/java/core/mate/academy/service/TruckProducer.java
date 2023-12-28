package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    private Truck volvoTruck = new Truck();
    private Truck mercedesTruck = new Truck();

    private List<Truck> truckList = List.of(volvoTruck, mercedesTruck);

    @Override
    public List<Truck> get() {
        return truckList;
    }
}
