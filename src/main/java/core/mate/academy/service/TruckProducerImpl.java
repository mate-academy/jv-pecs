package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducerImpl implements MachineProducer<Truck> {

    @Override
    public List<Truck> get() {
        List<Truck> trucksList = new ArrayList<>();
        trucksList.add(new Truck("Volvo", "yellow", true));
        trucksList.add(new Truck("Iveco", "red", false));
        trucksList.add(new Truck("Man", "green", true));
        return trucksList;
    }
}
