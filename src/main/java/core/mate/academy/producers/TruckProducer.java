package core.mate.academy.producers;

import core.mate.academy.model.Truck;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {

    @Override
    public List<Truck> get() {
        return List.of(new Truck(getRandomNum(), getRandomNum()),
                new Truck(getRandomNum(), getRandomNum()));
    }
}
