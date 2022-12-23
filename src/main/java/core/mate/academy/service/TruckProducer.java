package core.mate.academy.service;

import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import java.util.Arrays;
import java.util.List;

public class TruckProducer implements MachineProducer<Machine> {
    @Override
    public List get() {
        Truck truck = new Truck();
        Truck truck1 = new Truck();
        return Arrays.asList(truck, truck1);
    }
}
