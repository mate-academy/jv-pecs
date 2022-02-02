package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MachineServiceImpl implements MachineService<Machine> {
    @Override
    public List<Machine> getAll(Class<? extends Machine> type) {
        if (type == Bulldozer.class) {
            List<Bulldozer> machines = new ArrayList<>();
            for (int i = 0; i < 3; i++) {
                machines.add(new Bulldozer("Beast", "yellow", 600, "CAT"));
            }
            return new ArrayList<>(machines);
        }
        if (type == Excavator.class) {
            List<Excavator> machines = new ArrayList<>();
            for (int i = 0; i < 3; i++) {
                machines.add(new Excavator("Bob", "yellow", 15, "JCB"));
            }
            return new ArrayList<>(machines);
        }
        if (type == Truck.class) {
            List<Truck> machines = new ArrayList<>();
            for (int i = 0; i < 3; i++) {
                machines.add(new Truck("Goose", "white", "Volvo", 30));
            }
            return new ArrayList<>(machines);
        }

        return Collections.emptyList();
    }

    @Override
    public void fill(List<? super Machine> machines, Machine value) {
        for (int i = 0; i < machines.size(); i++) {
            machines.set(i, value);
        }

    }

    @Override
    public void startWorking(List<? extends Machine> machines) {
        for (Machine machine : machines) {
            machine.doWork();
        }
    }
}
