package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    @Override
    public List<Truck> get() {
        ArrayList<Truck> truckArrayList = new ArrayList<>();
        truckArrayList.add(new Truck("truck", "white", "kamaz", 2000, 1));
        truckArrayList.add(new Truck("truck", "blue", "reno", 2001, 2));
        truckArrayList.add(new Truck("truck", "green", "strength", 2012, 2));
        truckArrayList.add(new Truck("truck", "white", "raven", 2017, 3));
        truckArrayList.add(new Truck("truck", "white", "superin", 2019, 4));
        return truckArrayList;
    }
}
