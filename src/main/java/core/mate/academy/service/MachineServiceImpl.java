package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import java.util.LinkedList;
import java.util.List;

public class MachineServiceImpl implements MachineService<Machine> {
    @Override
    public List getAll(Class<? extends Machine> type) {
        if (Bulldozer.class.equals(type)) {
            return new BulldozerProducer().get();
        }
        if (Excavator.class.equals(type)) {
            return new ExcavatorProducer().get();
        }
        if (Truck.class.equals(type)) {
            return new TruckProducer().get();
        } else {
            return new LinkedList<Machine>();
        }
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
