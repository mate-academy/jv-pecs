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
    private final MachineProducer<Bulldozer> oneMachineProducer = new BulldozerProducer();
    private final MachineProducer<Truck> twoMachineProducer = new TruckProducer();
    private final MachineProducer<Excavator> threeMachineProducer = new ExcavatorProducer();

    @Override
    public List<Machine> getAll(Class<? extends Machine> type) {

        if (type.equals(Bulldozer.class)) {
            return new ArrayList<>(oneMachineProducer.get());
        } else if (type.equals(Truck.class)) {
            return new ArrayList<>(twoMachineProducer.get());
        } else if (type.equals(Excavator.class)) {
            return new ArrayList<>(threeMachineProducer.get());
        } else {
            return new ArrayList<>();
        }
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
