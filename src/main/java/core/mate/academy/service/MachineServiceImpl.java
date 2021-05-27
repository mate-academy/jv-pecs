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
    public MachineServiceImpl() {
    }

    public List<Machine> getAll(Class type) {
        List<Machine> result = new ArrayList<>();
        if (type == Bulldozer.class) {
            result = (List<Machine>) new BulldozerProducer().get();
        }
        if (type == Excavator.class) {
            result = (List<Machine>) new ExcavatorProducer().get();
            return result;
        }
        if (type == Truck.class) {
            result = (List<Machine>) new TruckProducer().get();
            return result;
        }
        return result;
    }

    @Override
    public void fill(List<? super Machine> machines, Object value) {
        int size = machines.size();
        for (int i = 0; i < size; i++) {
            machines.set(i, (Machine) value);
        }
    }

    @Override
    public void startWorking(List<? extends Machine> machines) {
        int size = machines.size();
        for (Machine machine : machines) {
            machine.doWork();
        }
    }

}
