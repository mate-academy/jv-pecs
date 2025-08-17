package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    @Override
    public List<Truck> get() {
        Truck truck1 = new Truck();
        truck1.setColor("green");
        truck1.setName("truck1");
        truck1.setBodyType("Van");
        truck1.setLoadCapacity(2000);
        Truck truck2 = new Truck();
        truck2.setColor("red");
        truck2.setName("truck2");
        truck2.setBodyType("Tank");
        truck2.setLoadCapacity(2500);
        return List.of(truck1, truck2);
    }
}
