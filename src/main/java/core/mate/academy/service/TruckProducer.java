package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {

    @Override
    public List<Truck> get() {
        Truck truck1 = new Truck(4000, 80, 115);
        truck1.setName("Truck1");
        truck1.setColor("White");
        Truck truck2 = new Truck(6000, 90, 150);
        truck2.setName("Truck2");
        truck2.setColor("Orange");
        List<Truck> list = List.of(truck1, truck2);
        return list;
    }
}
