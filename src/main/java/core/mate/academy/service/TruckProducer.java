package core.mate.academy.service;

import core.mate.academy.model.Truck;

import java.util.List;

public class TruckProducer implements MachineProducer {

    @Override
    public List<Truck> get() {
        return List.of(new Truck("TruckTIR", "Black", 2019, "Let's ride with me!"),
                new Truck("Truck ONE", "Black", 2020, "I'm winner"),
                new Truck("Truck X", "Metal", 2010, "Giving the best!"));
    }
}
