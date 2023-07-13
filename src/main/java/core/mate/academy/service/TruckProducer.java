package core.mate.academy.service;

import core.mate.academy.model.Truck;
import core.mate.academy.model.Truck;

import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    Truck firstTruck = new Truck(2, 145);
    Truck secondTruck = new Truck(4, 255);

    @Override
    public List<Truck> get() {
        List<Truck> listOfTrucks = new ArrayList<>();
        listOfTrucks.add(firstTruck);
        listOfTrucks.add(secondTruck);
        return listOfTrucks;
    }
}
