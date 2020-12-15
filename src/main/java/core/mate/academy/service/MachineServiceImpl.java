package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import java.util.ArrayList;
import java.util.List;

/**
 * Your implementation of MachineService.
 */
public class MachineServiceImpl implements MachineService<Machine> {
    @Override
    public List<Machine> getAll(Class<? extends Machine> type) {
        MachineProducer<? extends Machine> machineProducer = getProducer(type);
        return new ArrayList<>(machineProducer.get());
    }

    @Override
    public void fill(List<? super Machine> machines, Machine value) {
        for (int i = 0; i < machines.size(); i++) {
            machines.set(i, value);
        }
    }

    @Override
    public void startWorking(List<? extends Machine> machines) {
        for (Machine machine : machines) {
            machine.doWork();
        }
    }

    private MachineProducer<? extends Machine> getProducer(Class<? extends Machine> type) {
        if (type == Excavator.class) {
            return new ExcavatorProducer();
        } else if (type == Bulldozer.class) {
            return new BulldozerProducer();
        } else {
            return new TruckProducer();
        }
    }
}
