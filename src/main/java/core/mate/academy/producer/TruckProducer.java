package core.mate.academy.producer;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {

    @Override
    public List<Truck> get() {
        List<Truck> list = new ArrayList<>();
        list.add(new Truck(1.5));
        list.add(new Truck(2.0));
        list.add(new Truck(2.5));
        return list;
    }
}
