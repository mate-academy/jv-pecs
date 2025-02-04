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
        if (type.equals(Bulldozer.class)) {
            return List.of(new Bulldozer());
        } else if (type.equals(Truck.class)) {
            return List.of(new Truck());
        } else if (type.equals(Excavator.class)) {
            return List.of(new Excavator());
        } else {
            return List.of();
        }
    }

    @Override
    public void fill(List<? super Machine> machines, Machine value) {
        if (machines.isEmpty()) {
            return;
        }
        for (int i = 0; i < machines.size(); i++) {
            machines.set(i, value);
        }
    }

    @Override
    public void startWorking(List<? extends Machine> list) {

    }

}
