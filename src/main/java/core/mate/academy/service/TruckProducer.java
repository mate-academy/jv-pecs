package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    @Override
    public List<Truck> get() {
        ArrayList<Truck> trucks = new ArrayList<>();
        for (int i = 0; i < DEFAULT_NUMBER_OF_MACHINES; i++) {
            trucks.add(new Truck());
        }
        return trucks;
    }
}
