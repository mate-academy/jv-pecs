package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    public List<Truck> get() {
        List<Truck> list = new ArrayList<>();
        list.add(new Truck("Volvo FH16", "Yellow", 8000.0, 25));
        list.add(new Truck("Scania R500", "White", 7500.0, 20));
        return list;
    }
}
