package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class MachineServiceImpl implements MachineService<Machine> {
    @Override
    public List<Machine> getAll(Class<? extends Machine> type) {
        if (Truck.class.equals(type)) {
            return (List<Machine>) new Truck().get();
        }
        if (Bulldozer.class.equals(type)) {
            return (List<Machine>) new Bulldozer().get();
        }
        if (Excavator.class.equals(type)) {
            return (List<Machine>) new Excavator().get();
        }
        return new ArrayList<>();
    }

    @Override
    public void fill(List<? super Machine> machines, Machine value) {
        for (int i = 0; i < machines.size(); i++) {
            machines.set(i, value);
        }
    }

    @Override
    public void startWorking(List<? extends Machine> machines) {
        if (machines == null) {
            throw new RuntimeException("We don`t have machines in the list");
        }
        for (Machine m : machines) {
            m.doWork();
        }
    }
}
