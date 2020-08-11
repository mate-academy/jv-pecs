package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    @Override
    public List<Truck> get() {
        Truck truck1 = new Truck("truck1", "red");
        Truck truck2 = new Truck("truck2", "green");
        Truck truck3 = new Truck("truck3", "blue");

        truck1.setSpeed(50);
        truck2.setSpeed(100);
        truck3.setSpeed(150);

        return List.of(truck1, truck2, truck3);
    }
}
