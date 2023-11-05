package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

/**
 * Your implementation of MachineService.
 */
public class MachineServiceImpl implements MachineService<Machine> {
    private List<Machine> machines = List.of(new Truck("truck", "red", 12000),
            new Bulldozer("bulldozer", "yellow", 1500),
            new Excavator("excavator", "grey", 1100));

    @Override
    public List<Machine> get() {
        return machines;
    }

    @Override
    public List<Machine> getAll(Class<? extends Machine> type) {
        List<Machine> list = new ArrayList<>();

        for (Machine machine : machines) {
            if (machine.getClass() == type) {
                list.add(machine);
            }
        }
        return list;
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
