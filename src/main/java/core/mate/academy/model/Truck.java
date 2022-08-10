package core.mate.academy.model;

import core.mate.academy.service.MachineProducer;
import java.util.ArrayList;
import java.util.List;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck<T extends Machine> extends Machine implements MachineProducer<T> {
    private int maxWeight;
    private int bodyCapacity;
    private String roadType;

    public Truck(int maxWeight, int bodyCapacity, String roadType) {
        this.maxWeight = maxWeight;
        this.bodyCapacity = bodyCapacity;
        this.roadType = roadType;
    }

    public Truck() {
    }

    public int getMaxWeight() {
        return maxWeight;
    }

    public int getBodyCapacity() {
        return bodyCapacity;
    }

    public String getRoadType() {
        return roadType;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }

    @Override
    public List<T> get() {
        List<T> trucks = new ArrayList<>();
        trucks.add((T) new Truck<>(5000, 1000, "underground"));
        return trucks;
    }
}
