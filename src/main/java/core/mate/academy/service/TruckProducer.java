package core.mate.academy.service;

import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer<T extends Machine> implements MachineProducer {

    @Override
    public List<? super T> get() {
        List<T> trucks = new ArrayList<>();
        trucks.add((T) new Truck());
        trucks.add((T) new Truck());
        return trucks;
    }
}
