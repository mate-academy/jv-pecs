package core.mate.academy.service;

import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer {
    public static final int PRODUCTION_AMOUNT = 3;

    @Override
    public List<Machine> get() {
        List<Machine> truckList = new ArrayList<>();
        for (int i = 0; i < PRODUCTION_AMOUNT; i++) {
            truckList.add(new Truck());
        }
        return truckList;
    }
}
