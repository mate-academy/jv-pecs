package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class MachineServiceImpl implements MachineService<Machine> {

    @Override
    public List<Machine> getAll(Class<? extends Machine> type) {
        List<Machine> machine = new ArrayList<>();
        if (type == Bulldozer.class) {
            machine.addAll(new BulldozerProducerImpl().get());
        } else if (type == Excavator.class) {
            machine.addAll(new ExcavatorProducerImpl().get());
        } else if (type == Truck.class) {
            machine.addAll(new TruckProducerImpl().get());
        }
        return machine;
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
