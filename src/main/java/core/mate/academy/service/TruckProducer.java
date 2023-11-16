package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    private Truck firstTruck = new Truck("Mercedes", "white", 1);
    private Truck secondTruck = new Truck("MAN", "red", 20);

    @Override
    public List<Truck> get() {
        List<Truck> truckList = new ArrayList<>();
        truckList.add(firstTruck);
        truckList.add(secondTruck);
        return truckList;
    }
}
