package core.mate.academy.service;

import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Machine> {
    @Override
    public List<? super Machine> get() {
        List<? super Machine> trucks = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            trucks.add(new Truck());
        }
        return trucks;
    }
}
