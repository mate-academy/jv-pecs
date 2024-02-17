package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class MachineServiceImpl<T extends Machine> implements MachineService {

    @Override
    public List<T> getAll(Class obj) {
        List<? extends Machine> list = new ArrayList<>();
        if (obj == Bulldozer.class) {
            return (List<T>) new Bulldozer().get();
        } else if (obj == Excavator.class) {
            return (List<T>) new Excavator().get();
        } else if (obj == Truck.class) {
            return (List<T>) new Truck().get();
        }
        return List.of();
    }

    @Override
    public void fill(List machines, Machine value) {
        for (int i = 0; i < machines.size(); i++) {
            machines.set(i, value);
        }
    }

    @Override
    public void startWorking(List machines) {
        MachineService.super.startWorking(machines);
    }
}
