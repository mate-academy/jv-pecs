package core.mate.academy.service;

import core.mate.academy.model.Machine;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/**
 * Your implementation of MachineService.
 */

public class MachineServiceImpl implements MachineService<Machine> {
    private MachineTypes[] machineTypes = MachineTypes.values();

    @Override
    public List<Machine> getAll(Class<? extends Machine> type) {
        for (MachineTypes machine : machineTypes) {
            if (machine.getMachineClass().equals(type)) {
                return new ArrayList<>(machine.getMachineType().get());
            }
        }
        return new ArrayList<>();
    }

    @Override
    public void fill(List<? super Machine> machines, Machine value) {
        Collections.fill(machines, value);
    }

    @Override
    public void startWorking(List<? extends Machine> machines) {
        for (Machine machine : machines) {
            machine.doWork();
        }
    }
}
