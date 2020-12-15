package core.mate.academy.model;

import core.mate.academy.service.MachineProducer;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer {
    @Override
    public List<Machine> get() {
        List<Machine> returnValue = new ArrayList<>();
        returnValue.add(new Truck(30));
        returnValue.add(new Truck(50));
        returnValue.add(new Truck(20));
        return returnValue;
    }
}
