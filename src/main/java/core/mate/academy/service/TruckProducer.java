package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    @Override
    public List<Truck> get() {
        Truck truck1 = new Truck("tr867", "Grey");
        Truck truck2 = new Truck("tr123", "Yellow");
        Truck truck3 = new Truck("tr789", "Blue");

        truck1.setMaxSpeed(200);
        truck2.setMaxSpeed(300);
        truck3.setMaxSpeed(250);

        return List.of(truck1, truck2, truck3);
    }
}
