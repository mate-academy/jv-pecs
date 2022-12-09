package core.mate.academy.service;

import core.mate.academy.model.Machine;

import java.util.ArrayList;
import java.util.List;

/**
 * Your implementation of MachineService.
 */
public class MachineServiceImpl implements MachineService {
    @Override
    public List<Object> getAll(Class type) {
        List<? extends Machine> machines;
        if (type.equals(TruckProducer.class)) {
            TruckProducer truckProducer = new TruckProducer();
            machines = truckProducer.get();
            return new ArrayList<>(machines);
        } else if (type.equals(ExcavatorProducer.class)) {
            ExcavatorProducer excavatorProducer = new ExcavatorProducer();
            machines = excavatorProducer.get();
            return new ArrayList<>(machines);
        } else if (type.equals(BulldozerProducer.class)) {
            BulldozerProducer bulldozerProducer = new BulldozerProducer();
            machines = bulldozerProducer.get();
            return new ArrayList<>(machines);
        }
        return new ArrayList<>();
    }

    @Override
    public void fill(List<Object> machines, Object value) {

    }

    @Override
    public void startWorking(List<Object> machines) {

    }
}
