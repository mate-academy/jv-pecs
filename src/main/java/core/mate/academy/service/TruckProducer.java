package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    @Override
    public List<Truck> get() {
        final Truck truck2 = new Truck("Betty", "blue", "Crew cab");
        final Truck truck1 = new Truck("Chief", "white", "Cab and chassis");
        final Truck truck3 = new Truck("Lady", "red", "Dump");
        return List.of(truck1, truck2, truck3);
    }
}
