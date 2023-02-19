package core.mate.academy.model;

import java.util.ArrayList;
import java.util.List;

public class Truck extends Machine {
    public Truck() {
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }

    @Override
    public List<Truck> get() {
        List<Truck> listOfTrucks = new ArrayList<>();
        for (int i = 0; i < COUNT_OF_MACHINES; i++) {
            listOfTrucks.add(new Truck());
        }
        return listOfTrucks;
    }
}
