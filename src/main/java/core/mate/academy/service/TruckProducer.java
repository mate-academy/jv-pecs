package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    @Override
    public List<Truck> get() {
        Truck truck1 = new Truck();
        truck1.setName("Truck1");
        truck1.setColor("Green");
        truck1.setDriveType("6x2");
        truck1.setLoadCapacity(5);
        Truck truck2 = new Truck();
        truck2.setName("Truck2");
        truck2.setColor("Orange");
        truck2.setDriveType("4x2");
        truck2.setLoadCapacity(5);
        return List.of(truck1,truck2);
    }
}
