package core.mate.academy.producer.implementations;

import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import core.mate.academy.service.MachineProducer;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Machine> {
    @Override
    public List<Machine> get() {
        List<Machine> trucks = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            trucks.add(new Truck());
        }
        return trucks;
    }
}
