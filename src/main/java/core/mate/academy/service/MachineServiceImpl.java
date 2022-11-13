package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MachineServiceImpl implements MachineService<Machine> {
    @Override
    public List<Machine> getAll(Class<? extends Machine> type) {
        if (type == Truck.class) {
            return new ArrayList<>(new TruckProducer().get());
        }
        if (type == Excavator.class) {
            return new ArrayList<>(new ExcavatorProducer().get());
        }
        if (type == Bulldozer.class) {
            return new ArrayList<>(new BulldozerProducer().get());
        }
        if (type == Machine.class) {
            return new ArrayList<>();
        }
        return null;
    }
    
    @Override
    public void fill(List<? super Machine> machines, Machine value) {
        Collections.fill(machines, value);
    }
    
    @Override
    public void startWorking(List<? extends Machine> machines) {
        for (Machine machine : machines) {
            machine.doWork();
        }
    }
}
