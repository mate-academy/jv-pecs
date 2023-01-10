package core.mate.academy.service;

import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer {
    private List<Machine> truckList = new ArrayList<>();

    public TruckProducer() {
        truckList.add(new Truck());
        truckList.add(new Truck());
        truckList.add(new Truck());
    }

    @Override
    public List<Machine> get() {
        if (truckList.isEmpty()) {
            return null;
        }
        return truckList;
    }
}
