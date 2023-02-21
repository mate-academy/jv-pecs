package core.mate.academy.service;

import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TruckProducer implements MachineProducer<Truck> {
    private Random random = new Random();

    @Override
    public List<? extends Machine> get() {
        Truck truck1 = new Truck(random.nextInt());
        Truck truck2 = new Truck(random.nextInt());
        Truck truck3 = new Truck(random.nextInt());
        List<Truck> trucks = new ArrayList<>();
        trucks.add(truck1);
        trucks.add(truck2);
        trucks.add(truck3);
        return trucks;
    }
}
