package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Your implementation of MachineService.
 */
public class MachineServiceImpl implements MachineService<Machine> {
    @Override
    public List<Machine> getAll(Class<? extends Machine> type) {
        if (type == Bulldozer.class) {
            List<? extends Machine> bulldozers = new BulldozerProducerImpl().get();
            return new ArrayList<>(bulldozers);
        }
        if (type == Excavator.class) {
            List<? extends Machine> excavators = new ExcavatorProducerImpl().get();
            return new ArrayList<>(excavators);
        }
        if (type == Truck.class) {
            List<? extends Machine> trucks = new TruckProducerImpl().get();
            return new ArrayList<>(trucks);
        }
        return Collections.emptyList();
    }

    @Override
    public void startWorking(List<? extends Machine> machines) {
        for (Machine machine : machines) {
            machine.doWork();
        }
    }

    @Override
    public void fill(List<? super Machine> machines, Machine value) {
        Collections.fill(machines, value);
    }
}
