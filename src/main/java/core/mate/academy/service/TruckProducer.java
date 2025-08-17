package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    @Override
    public List<Truck> get() {
        Truck roadeTruck = new Truck();
        Truck cityTruck = new Truck();

        List<Truck> trucks = new ArrayList<>();
        trucks.add(roadeTruck);
        trucks.add(cityTruck);
        return trucks;
    }
}
