package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    @Override
    public List<Truck> get() {
        List<Truck> trucks = new ArrayList<Truck>();
        trucks.add(new Truck("Caterpillar", "Oil", 400));
        trucks.add(new Truck("Komatsu", "Metals", 350));
        trucks.add(new Truck("Hitachi", "Wood", 420));
        return trucks;
    }
}
