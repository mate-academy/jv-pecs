package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class MachineServiceImpl implements MachineService<Machine> {
    private final BulldozerProducer bulldozerProducer = new BulldozerProducer();
    private final ExcavatorProducer excavatorProducer = new ExcavatorProducer();
    private final TruckProducer truckProducer = new TruckProducer();

    public MachineServiceImpl() {
    }

    @Override
    public List<Machine> getAll(Class<? extends Machine> type) {
        List<Machine> machines = new ArrayList<>();
        if (type == Bulldozer.class) {
            machines.addAll(bulldozerProducer.get());
        } else if (type == Excavator.class) {
            machines.addAll(excavatorProducer.get());
        } else if (type == Truck.class) {
            machines.addAll(truckProducer.get());
        }
        return machines;
    }

    @Override
    public void startWorking(List<? extends Machine> machines) {
        for (Machine machine : machines) {
            machine.doWork();
        }
    }

    @Override
    public void fill(List<Object> machines, Machine value) {
        int size = machines.size();
        for (int i = 0;i < size;i++) {
            machines.set(i, value);
        }
    }
}
