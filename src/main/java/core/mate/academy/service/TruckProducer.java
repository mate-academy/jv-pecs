package core.mate.academy.service;

import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;

import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer <Truck> {
    @Override
    public List<Truck> get() {
        List<Truck> list = new ArrayList<>();
        list.add(new Truck("Beyond", "red", 7000));
        list.add(new Truck("Tosoulse", "blue", 7500));
        list.add(new Truck("Chanky", "green", 6000));
        return list;
    }
}
