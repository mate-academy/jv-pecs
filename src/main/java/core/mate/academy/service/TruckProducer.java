package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer {

    @Override
    public List<Truck> get() {
        List<Truck> list = new ArrayList<>();
        list.add(new Truck("Cat D6K2", "yellow"));
        list.add(new Truck("John Deere 6930", "yellow"));
        return list;
    }
}
