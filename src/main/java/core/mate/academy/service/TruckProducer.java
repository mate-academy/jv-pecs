package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {

    public List<Truck> get() {
        List<Truck> list = new ArrayList<>();

        list.add(new Truck(10.5, "стройматериалы", 30.0));
        list.add(new Truck(8.0, "жидкости", 25.0));
        list.add(new Truck(12.0, "техника", 40.0));
        return list;
    }
}
