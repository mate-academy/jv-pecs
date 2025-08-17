package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    private List<Truck> truckList = new ArrayList<>();

    @Override
    public List<Truck> get() {
        return fillList(truckList);
    }

    private List<Truck> fillList(List<Truck> list) {
        list.add(new Truck("2", "blue",100));
        list.add(new Truck("3", "yellow",200));
        list.add(new Truck("4", "green",300));
        list.add(new Truck("5", "orange",400));
        return list;
    }
}
