package core.mate.academy.impl;

import core.mate.academy.model.Truck;
import core.mate.academy.service.MachineProducer;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {

    @Override
    public List<Truck> get() {
        List<Truck> truckList = new ArrayList<>();
        truckList.add(new Truck("Tk1", "White", 2));
        truckList.add(new Truck("Tk2", "Blue", 4));
        return truckList;
    }
}
