package core.mate.academy.service;

import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;

import java.util.*;

public class TruckProducer implements MachineProducer<Truck> {
    @Override
    public List<Truck> get() {
        return new ArrayList<>();
    }
}
