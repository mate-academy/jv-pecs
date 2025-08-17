package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;

import java.util.ArrayList;
import java.util.List;

public class MachineServiceImpl implements MachineService<Machine> {
    @Override
    public List<Machine> getAll(Class<Machine> type) {
        List<Machine> machines = new ArrayList<>();
        machines.add(new Bulldozer("Caterpillar D9", 400, 3.5));
        machines.add(new Excavator("Komatsu PC200", 150, 2.0));
        machines.add(new Truck("Volvo FH", 500, 12.0));
        return machines;
    }

    @Override
    public void fill(List<? super Machine> machines, Machine value) {
        for (int i = 0; i < 5; i++) {
            machines.add(value);
        }
    }

    @Override
    public void startWorking(List<? extends Machine> machines) {
        for (Machine machine : machines) {
            machine.doWork();
        }
    }
}
