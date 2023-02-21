package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.List;

public class TruckProducerImpl<M> implements MachineProducer<M> {
    @Override
    public List<M> get() {
        M truck1 = (M) new Truck();
        M truck2 = (M) new Truck();
        M truck3 = (M) new Truck();
        return List.of(truck1, truck2, truck3);
    }
}
