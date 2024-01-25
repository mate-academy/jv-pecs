package core.mate.academy.model;

import core.mate.academy.service.MachineProducer;
import java.util.ArrayList;
import java.util.List;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine implements MachineProducer<Truck> {
    private int maxLoad;
    private int maxSpeed;

    public Truck() {
    }

    public Truck(int maxLoad, int maxSpeed) {
        this.maxLoad = maxLoad;
        this.maxSpeed = maxSpeed;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }

    @Override
    public List<Truck> get() {
        List<Truck> trucks = new ArrayList<>();
        trucks.add(new Truck(20, 90));
        trucks.add(new Truck(15, 100));
        return trucks;
    }
}
