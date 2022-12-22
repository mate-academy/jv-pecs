package core.mate.academy.service;

import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TruckProducer implements MachineProducer<Truck> {
    private final Random random = new Random();

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
