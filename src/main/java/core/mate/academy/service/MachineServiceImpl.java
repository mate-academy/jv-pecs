package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class MachineServiceImpl<T extends Machine> implements MachineService<T>,
        MachineProducer<T> {
    @Override
    public List<Machine> getAll(Class<? extends Machine> type) {
        List<Machine> newOne = new ArrayList<>();
        for (Machine machine : get()) {
            if (machine.getClass().equals(type)) {
                newOne.add(machine);
            }
        }
        return newOne;
    }

    @Override
    public void fill(List<? super Machine> machines, T value) {
        for (Object machine : machines) {
            machines.set(machines.indexOf(machine), value);
        }
    }

    @Override
    public void startWorking(List<? extends Machine> machines) {
        for (Machine machine : machines) {
            machine.doWork();
        }
    }

    @Override
    public List<Machine> get() {
        Machine truck = new Truck();
        Machine excavator = new Excavator();
        Machine bulldozer = new Bulldozer();
        return List.of(truck, excavator, bulldozer);
    }
}
