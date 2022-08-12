package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.List;

public class TruckProducer implements MachineProducer {
    @Override
    public List<Truck> get() {
        return List.of(new Truck("first","red",12, 15),
                new Truck("second","green",15, 17),
                new Truck("third","blue",10, 14));
    }
}
