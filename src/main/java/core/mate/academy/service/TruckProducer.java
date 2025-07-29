package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    @Override
    public List<Truck> get() {
        final List<Truck> trucks = new ArrayList<>();
        Truck t1 = new Truck();
        t1.setName("MAN TGA");
        t1.setColor("White");
        t1.setNumberOfAxles(6);
        trucks.add(t1);

        Truck t2 = new Truck();
        t2.setName("Volvo FH");
        t2.setColor("Black");
        t2.setNumberOfAxles(8);
        trucks.add(t2);

        return trucks;
    }
}
