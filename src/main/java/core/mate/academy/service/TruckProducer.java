package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    @Override
    public List<Truck> get() {
        List<Truck> retVal = new ArrayList<>();
        retVal.add(new Truck("Truck 0", "White", 20.0));
        retVal.add(new Truck("Truck 1", "Blue", 25.5));
        return retVal;
    }
}
