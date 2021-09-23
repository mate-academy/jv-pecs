package core.mate.academy.model;

import core.mate.academy.service.MachineProducer;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer {

    @Override
    public List<? extends Machine> get() {
        List<Truck> list = new ArrayList<>();
        list.add(new Truck(1000));
        list.add(new Truck(1500));
        list.add(new Truck(3000));
        return list;
    }
}
