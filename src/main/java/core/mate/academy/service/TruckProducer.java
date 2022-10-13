package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.List;

public class TruckProducer implements MachineProducer {
    @Override
    public List<Truck> get() {
        final Truck t1 = new Truck();
        t1.setColor("Blue");
        t1.setName("Johnny");

        final Truck t2 = new Truck();
        t1.setColor("White");
        t1.setName("Lois");

        final Truck t3 = new Truck();
        t1.setColor("Scarlet");
        t1.setName("Phillip");

        return List.of(t1, t2, t3);
    }
}
