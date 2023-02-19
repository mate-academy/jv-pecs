package core.mate.academy.model;

import java.util.ArrayList;
import java.util.List;

public class Truck extends Machine {
    private static final int COUNT_TRUCKS = 3;

    public Truck() {
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }

    @Override
    public List<Truck> get() {
        List<Truck> trucks = new ArrayList<>();
        for (int i = 0; i < COUNT_TRUCKS; i++) {
            trucks.add(new Truck());
        }
        return trucks;
    }
}
