package core.mate.academy.service;

import core.mate.academy.model.Machine;
import java.util.ArrayList;
import java.util.List;

/**
 * Your implementation of MachineService.
 */
public class MachineServiceImpl implements MachineService<Machine> {

    private final List<MachineProducer<? extends Machine>> producers = List.of(
            new BulldozerProducer(),
            new ExcavatorProducer(),
            new TruckProducer());

    @Override
    public List<Machine> getAll(Class<? extends Machine> type) {
        List<Machine> machineList = new ArrayList<>();
        for (MachineProducer<? extends Machine> producer : producers) {
            List<? extends Machine> machines = producer.get();
            for (Machine model : machines) {
                if (type.equals(model.getClass())) {
                    machineList.add(model);
                }
            }
        }
        return machineList;
    }

    @Override
    public void fill(List<? super Machine> machines, Machine value) {
        machines.replaceAll(ignored -> value);
    }

    @Override
    public void startWorking(List<? extends Machine> machines) {
        for (Machine machine : machines) {
            machine.doWork();
        }
    }
}
