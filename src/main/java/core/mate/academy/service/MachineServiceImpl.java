package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.BulldozerProducer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.ExcavatorProducer;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import core.mate.academy.model.TruckProducer;
import java.util.ArrayList;
import java.util.List;

/**
 * Your implementation of MachineService.
 */
public class MachineServiceImpl implements MachineService<Machine> {
    private BulldozerProducer bulldozerProducer = new BulldozerProducer();
    private ExcavatorProducer excavatorProducer = new ExcavatorProducer();
    private TruckProducer truckProducer = new TruckProducer();

    public MachineServiceImpl() {
    }

    @Override
    public List<Machine> getAll(Class<? extends Machine> type) {
        List<Machine> resultList = new ArrayList<>();
        if (type == Bulldozer.class) {
            resultList = bulldozerProducer.get();
        }
        if (type == Excavator.class) {
            resultList = excavatorProducer.get();
        }
        if (type == Truck.class) {
            resultList = truckProducer.get();
        }
        if (type != Bulldozer.class
                && type != Excavator.class
                && type != Truck.class) {
            resultList = new ArrayList<>();
        }
        return resultList;
    }

    @Override
    public void fill(List<? super Machine> machines, Machine value) {
        for (int i = 0; i < machines.size(); i++) {
            machines.set(i, value);
        }
    }

    public void startWorking(List<? extends Machine> machines) {
        for (Machine machine : machines) {
            machine.doWork();
        }
    }
}
