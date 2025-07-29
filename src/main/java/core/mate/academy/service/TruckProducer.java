package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    @Override
    public List<Truck> get() {
        return List.of(new Truck("Volvo", 600),
                new Truck("Ram", 450),
                new Truck("Ford", 400));
    }
}
