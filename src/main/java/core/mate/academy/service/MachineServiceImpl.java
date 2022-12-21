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
    private final Truck truck = new Truck();
    private final Bulldozer bulldozer = new Bulldozer();
    private final Excavator excavator = new Excavator();

    @Override
    public List<Machine> getAll(Class type) {
        List<? extends Machine> machines = new ArrayList<>();
        if (type.equals(truck.getClass())) {
            machines = truck.get();
        } else if (type.equals(bulldozer.getClass())) {
            machines = bulldozer.get();
        } else if (type.equals(excavator.getClass())) {
            machines = excavator.get();
        }
        return new ArrayList<>(machines);
    }

    @Override
    public void fill(List machines, Object value) {
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
