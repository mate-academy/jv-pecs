package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    @Override
    public List<Truck> get(int numberOfMachines) {
        List<Truck> trucks = new ArrayList<>();
        for (int i = 0; i < numberOfMachines; i++) {
            trucks.add(new Truck());
        }
        return trucks;
    }
}
