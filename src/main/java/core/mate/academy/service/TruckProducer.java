package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {

    @Override
    public List<Truck> get() {
        List<Truck> trucks = new ArrayList<>();
        int maxSpeed = 70;
        for (int i = 0; i < 3; i++) {
            trucks.add(new Truck(maxSpeed));
            maxSpeed++;
        }
        return trucks;
    }
}
