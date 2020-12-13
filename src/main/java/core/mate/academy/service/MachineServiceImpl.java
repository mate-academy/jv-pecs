package core.mate.academy.service;

import core.mate.academy.model.Machine;
import java.util.ArrayList;
import java.util.List;

public class MachineServiceImpl implements MachineService<Machine> {

    @Override
    public List<Machine> getAll(Class<? extends Machine> type) {
        if (type.getSimpleName().equals("Bulldozer")) {
            return new ArrayList<>(new BulldozerProducer().get());
        } else if (type.getSimpleName().equals("Excavator")) {
            return new ArrayList<>(new ExcavatorProducer().get());
        } else {
            return new ArrayList<>(new TruckProducer().get());
        }
    }

    @Override
    public void fill(List<? super Machine> machines, Machine value) {
        for (int i = 0; i < 3; i++) {
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
