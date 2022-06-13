package core.mate.academy.service;

import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TruckProducer implements MachineProducer<Machine> {
    @Override
    public List<Truck> get() {
        return new ArrayList<>(Arrays.asList(new Truck(), new Truck(), new Truck()));
    }
}
