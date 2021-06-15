package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    @Override
    public List<Truck> get() {
        List<Truck> truckList = new ArrayList<>();
        truckList.add(new Truck("Scania", "Green", "petrol"));
        truckList.add(new Truck("Volvo", "Blue", "diesel"));
        truckList.add(new Truck("КамАЗ", "Orange", "diesel"));
        return truckList;
    }
}
