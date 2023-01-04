package core.mate.academy.impl;

import core.mate.academy.enums.Colors;
import core.mate.academy.enums.Models;
import core.mate.academy.model.Truck;
import core.mate.academy.service.MachineProducer;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    private static final int DEFAULT_ARRAYLIST_CAPACITY = 10;

    @Override
    public List<Truck> get() {
        List<Truck> truckList = new ArrayList<>();
        for (int i = 0; i < DEFAULT_ARRAYLIST_CAPACITY; i++) {
            truckList.add(new Truck(Models.random(), Colors.random()));
        }
        return truckList;
    }
}
