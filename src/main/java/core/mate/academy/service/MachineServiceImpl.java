package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import core.mate.academy.model.Workable;
import java.util.Collections;
import java.util.List;

/**
 * Your implementation of MachineService.
 */
public class MachineServiceImpl implements MachineService<Machine> {
    @Override
    public List<Machine> getAll(Class<? extends Machine> type) {
        List<? extends Machine> resultList = Collections.emptyList();
        if (type == Bulldozer.class) {
            resultList = new BulldozerProducer().get();
        }
        if (type == Excavator.class) {
            resultList = new ExcavatorProducer().get();
        }
        if (type == Truck.class) {
            resultList = new TruckProducer().get();
        }
        return (List<Machine>) resultList;
    }

    @Override
    public void fill(List<? super Machine> machines, Machine value) {
        Collections.fill(machines, value);
    }

    @Override
    public void startWorking(List<? extends Machine> list) {
        list.forEach(Workable::doWork);
    }
}
