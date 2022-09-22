package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    @Override
    public List<Truck> get() {
        Truck truck1 = new Truck();
        Truck truck2 = new Truck();
        Truck truck3 = new Truck();
        List<Truck> listOfTrucks = new ArrayList<>();
        listOfTrucks.add(truck1);
        listOfTrucks.add(truck2);
        listOfTrucks.add(truck3);
        return listOfTrucks;
    }
}
