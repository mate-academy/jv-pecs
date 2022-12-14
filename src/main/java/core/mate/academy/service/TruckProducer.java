package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    @Override
    public List<Truck> get() {
        Truck truckMackLightning = new Truck("Mack", "red", 35, 1);
        Truck truckVolvo = new Truck();
        Truck truckScania = new Truck();
        return List.of(truckMackLightning, truckVolvo, truckScania);
    }
}
