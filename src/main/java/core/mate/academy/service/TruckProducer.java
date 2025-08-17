package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {

    @Override
    public List<Truck> get() {
        Truck truck1 = new Truck("Long","White",50);
        Truck truck2 = new Truck("Longer","White",75);
        Truck truck3 = new Truck("TheLongest","White",100);
        return List.of(truck1,truck2,truck3);
    }
}
