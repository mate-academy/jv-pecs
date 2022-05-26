package core.mate.academy.service;

import core.mate.academy.model.Truck;

import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    @Override
    public List<Truck> get() {
        List<Truck> list = new ArrayList<>();
        list.add(new Truck("Reno", "black", 1967));
        list.add(new Truck("Mercedes", "yellow", 2005));
        list.add(new Truck("Scania", "red", 2015));
        return list;
    }
}
