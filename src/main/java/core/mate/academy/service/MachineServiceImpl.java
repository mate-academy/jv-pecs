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
        MachineProducer<? extends Machine> producer;

        if (type == Bulldozer.class) {
            producer = new BulldozzerProducer();
        } else if (type == Excavator.class) {
            producer = new ExcavatorProducer();
        } else if (type == Truck.class) {
            producer = new TruckProducer();
        } else {
            return new ArrayList<Machine>();
        }
        return (List<Machine>) producer.get();
    }

    @Override
    public void fill(List<? super Machine> machines, Machine value) {
        for (int i = 0; i < machines.size(); i++) {
            machines.set(i, value);
        }
    }

    @Override
    public void startWorking(List<? extends Machine> list) {
        for (Machine machine : list) {
            machine.doWork();
        }
    }
}