package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {

    @Override
    public List<Truck> get() {
        return List.of(new Truck("CementTruck", "Pink", 100, 540),
                new Truck("FireTruck", "Brown", 150, 250),
                new Truck("CraneTruck", "Рurple", 200, 600));
    }
}
