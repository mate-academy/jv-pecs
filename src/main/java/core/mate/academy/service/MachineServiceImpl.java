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

    @Override
    public List<Machine> getAll(Class<? extends Machine> type) {
        List<Machine> machines = new ArrayList();
        int randomSize = new Random().nextInt(100);
        if (type == Truck.class) {
            for (int i = 0; i < randomSize; i++) {
                machines.add(new Truck());
            }
        }
        if (type == Bulldozer.class) {
            for (int i = 0; i < randomSize; i++) {
                machines.add(new Bulldozer());
            }
        }
        if (type == Excavator.class) {
            for (int i = 0; i < randomSize; i++) {
                machines.add(new Excavator());
            }
        }
        return machines;
    }

    @Override
    public <T> void fill(List<? super T> machines, T value) {
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
