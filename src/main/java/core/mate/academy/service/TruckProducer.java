package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer<E> implements MachineProducer<E> {
    @Override
    public List<Truck> get() {
        ArrayList<Truck> trucks = new ArrayList<>();
        for (int i = 0; i < LIST_SIZE; i++) {
            trucks.add(new Truck());
        }
        return trucks;
    }
}
