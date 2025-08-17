package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    @Override
    public List<Truck> get() {
        List<Truck> list = new ArrayList<>();
        list.add(new Truck("Volkswagen Crafter", "green", 2015, 220_000));
        list.add(new Truck("Mercedes-Benz Sprinter 316", "gray", 2006, 270_000));
        list.add(new Truck("Iveco Daily", "white", 2016, 236_000));
        return list;
    }
}
