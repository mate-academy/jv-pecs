package core.mate.academy.service;

import core.mate.academy.model.Machine;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MachineServiceImpl<T extends Machine> implements MachineService<T> {
    private static final int BULLDOZER_INDEX = 0;
    private static final int EXCAVATOR_INDEX = 1;
    private static final int TRUCK_INDEX = 2;
    private final MachineProducerImpl<Machine> machineProducer = new MachineProducerImpl<>();

    @Override
    public List<Machine> getAll(Class<? extends Machine> type) {
        String classType = type.toString();
        classType = classType.substring(classType.lastIndexOf(".") + 1);
        switch (classType) {
            case "Bulldozer":
                return machineProducer.get(BULLDOZER_INDEX);
            case "Excavator":
                return machineProducer.get(EXCAVATOR_INDEX);
            case "Truck":
                return machineProducer.get(TRUCK_INDEX);
            default:
                return new ArrayList<>();
        }
    }

    @Override
    public void fill(List<? super Machine> machines, T value) {
        Collections.fill(machines, value);
    }

    @Override
    public void startWorking(List<? extends Machine> machines) {
        for (Machine machine : machines) {
            machine.doWork();
        }
    }
}
