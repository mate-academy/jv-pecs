package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class MachineServiceImpl implements MachineService<Machine> {
    private final MachineProducer<Bulldozer> bulldozerProducer = new BulldozerProducer();
    private final MachineProducer<Excavator> excavatorProducer = new ExcavatorProducer();
    private final MachineProducer<Truck> truckProducer = new TruckProducer();

    @Override
    public List<Machine> getAll(Class<? extends Machine> type) {
        List<? extends Machine> list = new ArrayList<>();
        if (type.equals(Bulldozer.class)) {
            list = bulldozerProducer.get();
        } else if (type.equals(Excavator.class)) {
            list = excavatorProducer.get();
        } else if (type.equals(Truck.class)) {
            list = truckProducer.get();
        }
        return (List<Machine>) list;
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
