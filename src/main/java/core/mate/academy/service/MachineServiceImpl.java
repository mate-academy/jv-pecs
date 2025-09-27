package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class MachineServiceImpl implements MachineService<Machine> {
    private BulldozerProducer bulldozerProducer = new BulldozerProducer();
    private ExcavatorProducer excavatorProducer = new ExcavatorProducer();
    private TruckProducer truckProducer = new TruckProducer();

    @Override
    public List<Machine> getAll(Class<? extends Machine> type) {
        MachineProducer<? extends Machine> machineProducer;

        if (type == Bulldozer.class) {
            machineProducer = bulldozerProducer;
        } else if (type == Excavator.class) {
            machineProducer = excavatorProducer;
        } else if (type == Truck.class) {
            machineProducer = truckProducer;
        } else {
            return new ArrayList<>();
        }

        return new ArrayList<>(machineProducer.get());
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
