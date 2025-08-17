package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    @Override
    public List<Truck> get() {
        List<Truck> truckList = new ArrayList<>();
        truckList.add(new Truck("MAN","blue", 28));
        truckList.add(new Truck("Iveco","green",30));
        truckList.add(new Truck("Renault","black",29.5));
        return truckList;
    }
}
