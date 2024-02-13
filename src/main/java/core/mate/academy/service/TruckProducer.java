package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {

    @Override
    public List<Truck> get() {
        List<Truck> trucks = new ArrayList<>();
        Collections.addAll(trucks,
                new Truck("truck1", "white", 30.0, 15.0),
                new Truck("truck2", "grey", 35.0, 20.0),
                new Truck("truck3", "green", 40.0, 20.0)
        );
        return trucks;
    }
}
