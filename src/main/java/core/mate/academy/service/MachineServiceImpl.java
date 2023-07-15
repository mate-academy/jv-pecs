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
public class MachineServiceImpl<T extends Machine> implements MachineService<T>, MachineProducer {

    @Override
    public List<Machine> getAll(Class<? extends Machine> type) {
        List<Machine> baseMachineList = get();
        List<Machine> requestedListType = new ArrayList<>();
        for (Machine machine : baseMachineList) {
            if (type.isInstance(machine) && !type.equals(Machine.class)) {
                requestedListType.add(machine);
            }
        }
        return requestedListType;
    }

    @Override
    public void fill(List<Object> unknownList, T value) {
        Collections.fill(unknownList, value);
    }

    @Override
    public void startWorking(List<? extends Machine> machines) {
        for (Machine machine : machines) {
            machine.doWork();
        }
    }

    @Override
    public List<Machine> get() {
        return new ArrayList<>(List.of(new Truck(),new Bulldozer(),new Excavator()));
    }
}

