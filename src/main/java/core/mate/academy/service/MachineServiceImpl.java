package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class MachineServiceImpl implements MachineService<Machine> {
    private static final MachineProducer<? extends Machine>
            bulldozerProducer = new BulldozerProducer();
    private static final MachineProducer<? extends Machine>
            excavatorProducer = new ExcavatorProducer();
    private static final MachineProducer<? extends Machine>
            truckProducer = new TruckProducer();

    @Override
    public List<Machine> getAll(Class<? extends Machine> type) {
        if (Bulldozer.class.equals(type)) {
            return (List<Machine>) bulldozerProducer.get();
        } else if (Excavator.class.equals(type)) {
            return (List<Machine>) excavatorProducer.get();
        } else if (Truck.class.equals(type)) {
            return (List<Machine>) truckProducer.get();
        }
        return new ArrayList<>();
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
