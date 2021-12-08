package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer {

    @Override
    public List<Truck> get() {
        List<Truck> trucks = new ArrayList<>();
        Truck track1 = new Truck();
        trucks.add(track1);
        Truck track2 = new Truck();
        trucks.add(track2);
        Truck track3 = new Truck();
        trucks.add(track3);
        return trucks;
    }
}
