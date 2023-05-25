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
public class MachineServiceImpl implements MachineService {
    @Override
    public List<? extends Machine> getAll(Class type) {
        List<? extends Machine> machines = getProducer(type).get();
        return new ArrayList<>(machines);
    }

    @Override
    public void fill(List machines, Object value) {
        machines.replaceAll(e -> e = value);
    }

    @Override
    public void startWorking(List list) {
        for (Object obj : list) {
            ((Machine) obj).doWork();
        }
    }

    private MachineProducer<? extends Machine> getProducer(Class type) {
        if (Bulldozer.class.equals(type)) {
            return new BulldozerProducer();
        }
        if (Truck.class.equals(type)) {
            return new TruckProducer();
        }
        if (Excavator.class.equals(type)) {
            return new ExcavatorProducer();
        } else {
            return new MachineProducer() {
                @Override
                public List get() {
                    return new ArrayList<Machine>();
                }
            };
        }
    }
}
