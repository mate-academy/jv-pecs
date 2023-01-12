package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Your implementation of MachineService.
 */
public class MachineServiceImpl implements MachineService<Machine> {
    private MachineProducer bulldozerProducer = new BulldozerProducer();
    private MachineProducer excavatorProducer = new ExcavatorProducer();
    private MachineProducer truckProducer = new TruckProducer();

    @Override
    public List<Machine> getAll(Class<? extends Machine> type) {
        List<Machine> actualList = new ArrayList<>();
        if (type == Bulldozer.class) {
            return bulldozerProducer.get();
        }
        if (type == Excavator.class) {
            return excavatorProducer.get();
        }
        if (type == Truck.class) {
            return truckProducer.get();
        }
        return Collections.emptyList();
    }

    @Override
    public void fill(List<? super Machine> machines, Machine value) {
        for (int i = 0;i < machines.size();i++) {
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
