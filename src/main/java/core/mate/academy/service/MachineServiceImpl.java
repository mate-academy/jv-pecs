package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;

import java.util.List;

/**
 * Your implementation of MachineService.
 */
public class MachineServiceImpl implements MachineService {

    @Override
    public List<? extends Machine> getAll(Class type) {
        MachineProducer machineProducer = new Bulldozer();
        return machineProducer.get();
    }

    @Override
    public void fill(List machines, Object value) {

    }

    @Override
    public void startWorking(List list) {
    }
}
