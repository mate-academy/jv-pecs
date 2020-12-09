package core.mate.academy.service;

import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;

import java.util.List;

public class TruckProducer implements MachineProducer<Machine> {
    List<Machine> list = List.of(new Truck(), new Truck(), new Truck());

    @Override
    public List<Machine> get() {
        return list;
    }
}
