package core.mate.academy.service;

import core.mate.academy.BulldozerProducer;
import core.mate.academy.ExcavatorProducer;
import core.mate.academy.TruckProducer;
import core.mate.academy.model.Machine;
import java.util.ArrayList;
import java.util.List;

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
        int size = machines.size();
        for (int i = 0; i < size; i++) {
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
