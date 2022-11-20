package core.mate.academy.model;

import core.mate.academy.service.MachineProducer;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Machine> {
    private List<Machine> list = new ArrayList<>();

    public List<Machine> get() {
        list.add(new Truck());
        list.add(new Truck());
        list.add(new Truck());
        return list;
    }
}
