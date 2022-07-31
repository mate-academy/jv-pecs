package core.mate.academy.service;

import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer {

    @Override
    public List<? extends Machine> get() {
        List<Truck> truckList = new ArrayList<>();
        Truck truck = new Truck();
        for (int i = 0; i < 3; i++) {
            truckList.add(truck);
        }
        return truckList;
    }
}
