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
    private BulldozerProducer bulldozerProducer;
    private TruckProducer truckProducer;
    private ExcavatorProducer excavatorProducer;

    public MachineServiceImpl() {
        bulldozerProducer = new BulldozerProducer();
        truckProducer = new TruckProducer();
        excavatorProducer = new ExcavatorProducer();
    }

    @Override
    public List<? extends Machine> getAll(Class type) {
        List<? extends Machine> result = new ArrayList();

        if (type == Bulldozer.class) {
            result = bulldozerProducer.get();
        }
        if (type == Truck.class) {
            result = truckProducer.get();
        }
        if (type == Excavator.class) {
            result = excavatorProducer.get();
        }
        return result;
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
