package core.mate.academy.service;

import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    @Override
    public List<Machine> get() {
        Truck truck = new Truck();
        List<Machine> list = new ArrayList<>();
        list.add(truck);
        return list;
    }
}
