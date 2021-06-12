package core.mate.academy.service;

import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Machine> {
    @Override
    public List<Machine> get() {
        List<Machine> truckList = new ArrayList<>();
        truckList.add(new Truck("Scania", "Green", "petrol"));
        truckList.add(new Truck("Volvo", "Blue", "diesel"));
        truckList.add(new Truck("КамАЗ", "Orange", "diesel"));
        return truckList;
    }
}
