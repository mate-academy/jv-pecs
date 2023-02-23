package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class MachineServiceImpl implements MachineService<Machine> {
    @Override
    public List<Machine> getAll(Class<?> type) {
        if (getMachineInstance(type) == null) {
            return new ArrayList<>();
        }
        List<Machine> list = new ArrayList<>();
        list.add(getMachineInstance(type));
        return list;
    }

    @Override
    public void fill(List<Object> machines, Machine value) {
        for (int i = 0; i < machines.size(); i++) {
            machines.set(i, getMachineInstance(value.getClass()));
        }
    }

    @Override
    public void startWorking(List list) {
    }

    private Machine getMachineInstance(Class<?> type) {
        if (type.equals(Bulldozer.class)) {
            return new Bulldozer();
        } else if (type.equals(Excavator.class)) {
            return new Excavator();
        } else if (type.equals(Truck.class)) {
            return new Truck();
        } else {
            return null;
        }
    }
}
