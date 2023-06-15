package core.mate.academy.service;

import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer {
    private final List<Machine> truckList = new ArrayList<>();

    @Override
    public List<Machine> get() {
        for (int i = 0; i < 3; i++) {
            truckList.add(new Truck());
        }
        return truckList;
    }
}
