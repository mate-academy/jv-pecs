package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {

    @Override
    public List<Truck> produce() {

        Truck t0 = new Truck();
        t0.setId(0);
        t0.setMaximumPayload(15_000);

        Truck t1 = new Truck();
        t1.setId(1);
        t1.setMaximumPayload(20_000);

        List<Truck> trucks = new ArrayList<>();
        trucks.add(t0);
        trucks.add(t1);
        return trucks;
    }
}
