package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Your implementation of MachineService.
 */
public class MachineServiceImpl implements MachineService<Machine> {
    private static final int MAX_COUNT_GENERATING_MACHINE = 100;

    @Override
    public List<Machine> getAll(Class<? extends Machine> type) {
        List<Machine> machines = new ArrayList();
        int randomSize = new Random().nextInt(MAX_COUNT_GENERATING_MACHINE);
        final String typeSimpleName = type.getSimpleName();
        switch (typeSimpleName) {
            case "Truck": {
                for (int i = 0; i < randomSize; i++) {
                    machines.add(new Truck());
                }
            }
            case "Bulldozer": {
                for (int i = 0; i < randomSize; i++) {
                    machines.add(new Bulldozer());
                }
            }
            case "Excavator": {
                for (int i = 0; i < randomSize; i++) {
                    machines.add(new Excavator());
                }
            }
            default: {
                return machines;
            }
        }
    }

    @Override
    public void fill(List<? super Machine> machines, Machine value) {
        int size = machines.size();
        for (int i = 0; i < size; i++) {
            machines.set(i, value);
        }
    }

    @Override
    public void startWorking(List<? extends Machine> machines) {
        int size = machines.size();
        for (Machine machine : machines) {
            machine.doWork();
        }
    }
}
