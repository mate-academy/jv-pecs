package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {

    @Override
    public List<Truck> get() {
        return new ArrayList<>(List.of(
                new Truck("Cat", "yellow", 212.13),
                new Truck("Cat", "Blue", 3213.21),
                new Truck("Volvo", "Green", 543343.21)
        ));
    }
}
