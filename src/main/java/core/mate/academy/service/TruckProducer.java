package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {

    @Override
    public List<Truck> get() {
        Truck truck1 = new Truck();
        truck1.setBodyType("flatbed");
        truck1.setLoad(3);
        truck1.setColor("gray");
        truck1.setName("first truck");
        Truck truck2 = new Truck();
        truck2.setBodyType("container");
        truck2.setLoad(15);
        truck2.setColor("black");
        truck2.setName("second truck");
        return List.of(truck1, truck2);
    }
}
