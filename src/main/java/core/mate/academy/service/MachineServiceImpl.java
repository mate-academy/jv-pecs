package core.mate.academy.service;

import core.mate.academy.model.BulldozerProducer;
import core.mate.academy.model.ExcavatorProducer;
import core.mate.academy.model.Machine;
import core.mate.academy.model.TruckProducer;
import java.util.ArrayList;
import java.util.List;

/**
 * Your implementation of MachineService.
 */
public class MachineServiceImpl implements MachineService<Machine> {
    private static final String BULLDOZER = "Bulldozer";
    private static final String EXCAVATOR = "Excavator";
    private static final String TRUCK = "Truck";

    @Override
    public List<Machine> getAll(Class<? extends Machine> type) {
        MachineProducer<? extends Machine> machineProducer;
        switch (type.getSimpleName()) {
            case BULLDOZER:
                machineProducer = new BulldozerProducer();
                return new ArrayList<>(machineProducer.get());
            case EXCAVATOR:
                machineProducer = new ExcavatorProducer();
                return new ArrayList<>(machineProducer.get());
            case TRUCK:
                machineProducer = new TruckProducer();
                return new ArrayList<>(machineProducer.get());
            default:
                return new ArrayList<>();
        }
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
}
