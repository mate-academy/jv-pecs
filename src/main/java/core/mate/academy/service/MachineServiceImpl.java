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
    public List<Machine> getAll(Class<? extends Machine> type) {
        BulldozerProducer bulldozers = new BulldozerProducer();
        TruckProducer trucks = new TruckProducer();
        ExcavatorProducer excavators = new ExcavatorProducer();
        return (List<Machine>) (type == Bulldozer.class ? bulldozers.get() :
                (type == Excavator.class ? excavators.get() :
                        (type == Truck.class ? trucks.get() :
                                new ArrayList<>())));
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
        for (Machine machine: machines) {
            machine.doWork();
        }
    }
}
