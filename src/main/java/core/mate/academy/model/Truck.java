package core.mate.academy.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {

    private int capacity;

    public Truck() {
    }

    public Truck(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }

    @Override
    public List<? extends Machine> get() {
        Truck truck1 = new Truck(random.nextInt());
        Truck truck2 = new Truck(random.nextInt());
        Truck truck3 = new Truck(random.nextInt());
        List<Truck> list = new ArrayList<>();
        list.add(truck1);
        list.add(truck2);
        list.add(truck3);
        return list;
    }
}
