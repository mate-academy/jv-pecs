package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    @Override
    public List<Truck> get() {
        List<Truck> list = new ArrayList<>();
        list.add(new Truck("Freightliner FLA 9664", "Black", 10));
        list.add(new Truck("International", "Red", 20));
        list.add(new Truck("Volvo", "Blue", 8));
        return list;
    }
}
