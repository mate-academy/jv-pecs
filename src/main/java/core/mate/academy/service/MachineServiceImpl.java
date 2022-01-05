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
public class MachineServiceImpl implements MachineService<Machine> {

    @Override
    public List<Machine> getAll(Class type) {
        List<Machine> list = new ArrayList<Machine>();

        if (type == Bulldozer.class) {
            list.addAll((new BulldozerProducer()).get());
        }
        if (type == Excavator.class) {
            list.addAll((new ExcavatorProducer()).get());
        }
        if (type == Truck.class) {
            list.addAll((new TruckProducer()).get());
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
