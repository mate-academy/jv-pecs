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
public class MachineServiceImpl implements MachineProducer, MachineService<Machine> {

    @Override
    public List<Machine> getAll(Class type) {
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
    public void fill(List machines, Object value) {
        int size = machines.size();
        for (int i = 0; i < size; i++) {
            machines.set(i, value);
        }
    }

    @Override
    public void startWorking(List list) {
        List<? extends Machine> items = list;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            items.get(i).doWork();
        }
    }

    @Override
    public List<Machine> get() {
        List<Machine> machines = new ArrayList();
        machines.add(new Truck("SkyTrack", "blue", 200, 2));
        machines.add(new Bulldozer("LoveDozer", "red", 3, 5));
        machines.add(new Excavator("Submarine", "yellow", 1, "track"));
        machines.add(new Truck("GreenpeaceTruck", "green", 150, 1));
        machines.add(new Bulldozer("DarkKnight", "black", 1, 3));
        machines.add(new Excavator("GirlMachine", "ping", 2, "wheel"));
        return machines;
    }
}
