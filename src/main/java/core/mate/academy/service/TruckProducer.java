package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    @Override
    public List<Truck> get() {
        List<Truck> list = new ArrayList<Truck>();
        list.add(createTruck("Truck red", "red", 12, 2500));
        list.add(createTruck("Truck blue", "blue", 16, 3500));
        list.add(createTruck("Truck green", "green", 8, 2000));
        return list;
    }

    private Truck createTruck(String name, String color, int countWheels, int weight) {
        Truck truck = new Truck();
        truck.setName(name);
        truck.setColor(color);
        truck.setCountWheels(countWheels);
        truck.setWeight(weight);
        return truck;
    }
}
