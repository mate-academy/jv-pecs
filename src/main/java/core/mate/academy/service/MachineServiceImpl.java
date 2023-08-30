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
        List<? extends Machine> list = new ArrayList<>();
        if (type.equals(Bulldozer.class)) {
            list = new BulldozerProducer().get();
        }
        if (type.equals(Truck.class)) {
            list = new TruckProducer().get();
        }
        if (type.equals(Excavator.class)) {
            list = new ExcavatorProducer().get();
        }
        return (List) list;
    }

    @Override
    public void startWorking(List<? extends Machine> list) {
        for (Machine machine : list) {
            machine.doWork();
        }
    }

    @Override
    public void fill(List<? super Machine> machines, Machine value) {
        for (int i = 0; i < machines.size(); i++) {
            machines.set(i, value);
        }
    }
}
