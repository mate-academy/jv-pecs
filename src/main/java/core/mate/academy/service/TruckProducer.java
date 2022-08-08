package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer<T extends Truck> implements MachineProducer {
    private List<Truck> listOfTruck;

    public TruckProducer() {
        listOfTruck = new ArrayList<>();
        listOfTruck.add(new Truck("truck1", 700));
        listOfTruck.add(new Truck("truck2", 800));
        listOfTruck.add(new Truck("truck3", 900));
    }

    @Override
    public List<Truck> get() {
        return listOfTruck;
    }
}
