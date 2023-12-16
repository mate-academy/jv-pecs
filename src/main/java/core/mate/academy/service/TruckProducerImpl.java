package core.mate.academy.service;

import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducerImpl implements MachineProducer<Machine> {

    @Override
    public List<Machine> get(Class<? extends Machine> type) {
        List<Machine> trucks = new ArrayList<>();
        Truck truckOne = new Truck();
        Truck truckTwo = new Truck();
        trucks.add(truckOne);
        trucks.add(truckTwo);
        return trucks;
    }
}
