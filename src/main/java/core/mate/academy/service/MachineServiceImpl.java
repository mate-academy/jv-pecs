package core.mate.academy.service;

import core.mate.academy.model.Machine;

import java.util.ArrayList;
import java.util.List;

/**
 * Your implementation of MachineService.
 */
public class MachineServiceImpl implements MachineService<Machine>{
    @Override
    public List<Machine> getAll(Class<? extends Machine> type) {
        List<? extends Machine> retVal = getProducer(type).get();
        return new ArrayList<>(retVal);
    }

    @Override
    public void fill(List<? super Machine> machines, Machine value) {
        int i = machines.indexOf(value);
        if (i  > -1) {
            machines.set(i, value);
        } else {
            machines.add(value);
        }
    }

    @Override
    public void startWorking(List<? extends Machine> machines) {
        for(Machine machine : machines) {
            machine.doWork();
        }
    }

    private MachineProducer getProducer(Class type) {
        if (BulldozerProducer.class.equals(type)) {
            return new BulldozerProducer();
        }
        if (ExcavatorProducer.class.equals(type)) {
            return new ExcavatorProducer();
        }
        if (TruckProducer.class.equals(type)) {
            return new ExcavatorProducer();
        }
        throw new IllegalArgumentException("MachineProducer can not be '" + type + "\'");
    }
}
