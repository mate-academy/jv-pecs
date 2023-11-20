package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    private List<Truck> trucks;

    @Override
    public List<Truck> get() {
        trucks = new ArrayList<>();
        int index = 0;
        while (index != DEFAULT_MACHINES_AMOUNT) {
            trucks.add(new Truck());
            index++;
        }
        return trucks;
    }
}
