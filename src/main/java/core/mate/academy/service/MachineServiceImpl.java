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

    @Override

    public List<Machine> getAll(Class<? extends Machine> type) {
        List<? extends Machine> list = new ArrayList<>();
        if (Bulldozer.class.equals(type)) {
            list = new BulldozerProducer().get();
        } else if (Excavator.class.equals(type)) {
            list = new ExcavatorProducer().get();
        } else if (Truck.class.equals(type)) {
            list = new TruckProducer().get();
        }
        return (List<Machine>) list;
    }

    @Override
    public void fill(List<? super Machine> machines, Machine value) {
        for (int i = 0; i < machines.size(); i++) {
            machines.set(i, value);
        }
    }

    @Override
    public void startWorking(List<? extends Machine> machines) {
        for (Machine machine: machines) {
            machine.doWork();
        }
    }
}
