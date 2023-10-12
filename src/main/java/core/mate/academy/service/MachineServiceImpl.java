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
        List<Machine> result = new ArrayList<>();
        if (type == Bulldozer.class) {
            result.addAll(new BulldozerProducer().get());
        } else if (type == Truck.class) {
            result.addAll(new TruckProducer().get());
        } else if (type == Excavator.class) {
            result.addAll(new ExcavatorProducer().get());
        }
        return result;
    }

    @Override
    public void fill(List<? super Machine> machines, Machine value) {
        machines.replaceAll(ignored -> value);
    }

    @Override
    public void startWorking(List<? extends Machine> machines) {
        for (Machine machine : machines) {
            machine.doWork();
        }
    }
}
