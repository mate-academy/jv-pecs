package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    public List<Truck> get() {
        List<Truck> trucks = new ArrayList<>();
        trucks.add(new Truck(10,true));
        trucks.add(new Truck(25,true));
        trucks.add(new Truck(20,false));
        return trucks;
    }
}
