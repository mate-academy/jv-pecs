package core.mate.academy.service;

import core.mate.academy.model.Machine;
import java.util.ArrayList;
import java.util.List;

public class MachineServiceImpl implements MachineService<Machine> {
    @Override
    public List<? extends Machine> getAll(Class type) {
        if (type == core.mate.academy.model.Bulldozer.class) {
            return new BulldozerProducer().get();
        }

        if (type == core.mate.academy.model.Excavator.class) {
            return new ExcavatorProducer().get();
        }
        if (type == core.mate.academy.model.Truck.class) {
            return new TruckProducer().get();
        }
        return new ArrayList<>();
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
