package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    @Override
    public List<Truck> get() {
        List<Truck> trucks = new ArrayList<>();
        trucks.add(new Truck("Volvo", "FH 16 750", 256.400, 136.62));
        trucks.add(new Truck("Kenworth", "W990", 316.078, 128.4));
        trucks.add(new Truck("Scania ", "R 730", 144.220, 108.5));
        return trucks;
    }
}
