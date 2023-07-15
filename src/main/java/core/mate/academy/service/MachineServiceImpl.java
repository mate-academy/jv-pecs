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
        List<Machine> machineList = new ArrayList<>();
        if (type.equals(Truck.class)) {
            machineList = new ArrayList<>(new TruckProducer().get());
        } else if (type.equals(Bulldozer.class)) {
            machineList = new ArrayList<>(new BulldozerProducer().get());
        } else if (type.equals(Excavator.class)) {
            machineList = new ArrayList<>(new ExcavatorProducer().get());
        }
        return machineList;
    }

    @Override
    public <T extends Machine> void fill(List<? super T> list, T value) {
        Collections.fill(list, value);
    }

    @Override
    public void startWorking(List<? extends Machine> machines) {
        for (Machine machine : machines) {
            machine.doWork();
        }
    }
}
