package core.mate.academy.model;

import core.mate.academy.service.MachineProducer;
import java.util.List;

public class TruckBuilder implements MachineProducer<Truck> {

    @Override
    public List<Truck> get() {
        return List.of(new Truck(1500),
                new Truck(2000), new Truck(5000));

    }
}
