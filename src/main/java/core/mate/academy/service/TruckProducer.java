package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    @Override
    public List<Truck> get() {
        List<Truck> trucks = new ArrayList<>();
        trucks.add(new Truck("Freightliner", "violet", "Light"));
        trucks.add(new Truck("Paccar", "amaranth", "Off-road"));
        trucks.add(new Truck("Dongfeng", "aquamarine", "Heavy"));
        return trucks;
    }
}
