package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import java.util.List;

public class MachineServiceImpl implements MachineService<Machine> {
    private static final BulldozerProducer bulldozers = new BulldozerProducer();
    private static final TruckProducer trucks = new TruckProducer();
    private static final ExcavatorProducer excavators = new ExcavatorProducer();

    @Override
    public List getAll(Class<? extends Machine> type) {
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
