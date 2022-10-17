package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import core.mate.academy.producers.BulldozerProducer;
import core.mate.academy.producers.ExcavatorProducer;
import core.mate.academy.producers.MachineProducer;
import core.mate.academy.producers.TruckProducer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class MachineServiceImpl implements MachineService<Machine> {
    @Override
    public List<Machine> getAll(Class<? extends Machine> type) {
        MachineProducer<Machine> machineProducer = null;
        if (type == Bulldozer.class) {
            machineProducer = new BulldozerProducer();
        }
        if (type == Excavator.class) {
            machineProducer = new ExcavatorProducer();
        }
        if (type == Truck.class) {
            machineProducer = new TruckProducer();
        }
        return machineProducer == null ? Collections.emptyList() : machineProducer.get();
    }

    @Override
    public void fill(List<? super Machine> machines, Machine value) {
        Collections.fill(machines, value);
    }

    @Override
    public void startWorking(List<? extends Machine> list) {
        for (Machine machine : list) {
            machine.doWork();
        }
    }
}
