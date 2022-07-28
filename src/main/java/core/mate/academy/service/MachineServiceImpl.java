package core.mate.academy.service;

import core.mate.academy.model.Machine;
import java.util.ArrayList;
import java.util.List;

/**
 * Your implementation of MachineService.
 */
public class MachineServiceImpl implements MachineService<Machine> {
    @Override
    public List getAll(Class<? extends Machine> type) {
        switch (type.getSimpleName()) {
            case "Bulldozer":
                return new BulldozerProducer().get();
            case "Excavator":
                return new ExcavatorProducer().get();
            case "Truck":
                return new TruckProducer().get();
            default:
                return new ArrayList<Machine>();
        }
    }

    @Override
    public void fill(List<? super Machine> machines, Machine machine) {
        for (int i = 0; i < machines.size(); i++) {
            machines.set(i, machine);
        }
    }

    @Override
    public void startWorking(List<? extends Machine> machines) {
        for (Machine machine : machines) {
            machine.doWork();
        }
    }
}
