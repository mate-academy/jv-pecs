package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {

    @Override
    public List<Truck> get() {
        Truck modelOne = new Truck(70, 80);
        Truck modelTwo = new Truck(75,80);
        Truck modelTree = new Truck(80,85);
        List<Truck> trucks = List.of(modelOne, modelTwo, modelTree);
        return trucks;
    }
}
