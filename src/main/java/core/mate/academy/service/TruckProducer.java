package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer<T extends Truck> implements MachineProducer {
    private List<Truck> produce() {
        List<Truck> truckList = new ArrayList<>();
        for (int i = 0; i < DEFAULT_NUMBER_OF_MACHINES; i++) {
            truckList.add(new Truck());
        }
        return truckList;
    }

    @Override
    public List<Truck> get() {
        return produce();
    }
}
