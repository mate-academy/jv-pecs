package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {

    @Override
    public List<Truck> get() {
        Truck newTruck1 = new Truck(1000,10);
        Truck newTruck2 = new Truck(2000,12);
        Truck newTruck3 = new Truck(3000,15);
        return List.of(newTruck1, newTruck2, newTruck3);
    }
}
