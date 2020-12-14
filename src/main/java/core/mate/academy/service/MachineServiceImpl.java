package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import java.util.List;

/**
 * Your implementation of MachineService.
 */
public class MachineServiceImpl implements MachineService<Machine> {
    @Override
    public List<Machine> getAll(Class<? extends Machine> type) {
        if (type.getName().equals(new Truck().getClass().getName())) {
            return new Truck().get();
        } else if (type.getName().equals(new Bulldozer().getClass().getName())) {
            return new Bulldozer().get();
        } else {
            return new Excavator().get();
        }
    }

    @Override
    public void fill(List<? super Machine> machines, Object value) {
        for (int i = 0; i < machines.size(); i++) {
            machines.set(i, (Machine) value);
        }
    }

    @Override
    public void startWorking(List<? extends Machine> list) {
        for (Machine machine : list) {
            machine.doWork();
        }
    }
}
