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
public class MachineServiceImpl implements MachineService<Machine>{
    @Override
    public List<Machine> getAll(Class<? extends Machine> type) {
        return null;
    }

    @Override
    public void fill(List<? super Machine> machines, Object value) {

    }

    @Override
    public void startWorking(List<? extends Machine> list) {

    }
}
