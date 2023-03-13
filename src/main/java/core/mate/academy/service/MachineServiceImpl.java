package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import java.util.List;

public class MachineServiceImpl implements MachineService<Machine> {
    @Override
    public List getAll(Class<? extends Machine> type) {
        BulldozerProducer bulldozers = new BulldozerProducer();
        TruckProducer trucks = new TruckProducer();
        ExcavatorProducer excavators = new ExcavatorProducer();
        return (type == Bulldozer.class ? bulldozers.get() :
                (type == Excavator.class ? excavators.get() :
                        (type == Truck.class ? trucks.get() :
                                List.of())));
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
