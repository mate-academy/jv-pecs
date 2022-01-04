package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

/**
 * Your implementation of MachineService.
 */
public class MachineServiceImpl implements MachineService {

    @Override
    public List<Machine> getAll(Class type) {
        List<Machine> list = new ArrayList<Machine>();

        if (type == Bulldozer.class) {
            for (int i = 0;i < 3;i++) {
                list.add(new Bulldozer());
            }
        }
        if (type == Excavator.class) {
            for (int i = 0;i < 3;i++) {
                list.add(new Excavator());
            }
        }
        if (type == Truck.class) {
            for (int i = 0;i < 3;i++) {
                list.add(new Truck());
            }
        }

        return list;
    }

    @Override
    public void fill(List machines, Machine value) {
        for (int i = 0; i < machines.size(); i++) {
            machines.set(i,value);
        }
    }

    @Override
    public void startWorking(List machines) {
        for (int i = 0; i < machines.size(); i++) {
            Machine m = (Machine) machines.get(i);
            m.doWork();
        }
    }
}
