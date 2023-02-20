package core.mate.academy.model;

import core.mate.academy.service.MachineProducer;
import java.util.ArrayList;
import java.util.List;

public class Truck extends Machine implements MachineProducer<Truck> {
    private final List<Truck> trucks = new ArrayList<>();

    public Truck() {
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }

    @Override
    public List<Truck> get() {
        trucks.add(new Truck());
        return trucks;
    }
}
