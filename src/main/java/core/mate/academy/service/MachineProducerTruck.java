package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class MachineProducerTruck implements MachineProducer<Truck> {
    @Override
    public List<Truck> get() {
        List<Truck> truckList = new ArrayList<>();
        Truck truckDay = new Truck("Day", "yellow", 2018, "Japanese");
        Truck truckNight = new Truck("Night", "red", 1990, "Poland");

        truckList.add(truckDay);
        truckList.add(truckNight);

        return truckList;
    }
}
