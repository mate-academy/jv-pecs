package core.mate.academy.model;

import core.mate.academy.service.MachineProducer;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {

    @Override
    public List<Truck> get() {
        List<Truck> trucks = new ArrayList<>();
        trucks.add(new Truck(23, "General purpose"));
        trucks.add(new Truck(50,"Specialized"));
        trucks.add(new Truck(25,"Specialized"));
        return trucks;
    }
}
