package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer {
    @Override
    public List<Truck> get() {
        Truck truck = new Truck();
        Truck truck1 = new Truck();
        Truck truck2 = new Truck();
        List<Truck> listToReturn = new ArrayList<>();
        listToReturn.add(truck);
        listToReturn.add(truck1);
        listToReturn.add(truck2);
        return listToReturn;
    }
}
