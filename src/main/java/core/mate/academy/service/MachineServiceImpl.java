package core.mate.academy.service;

import core.mate.academy.model.Machine;
import java.util.Collections;
import java.util.List;

public class MachineServiceImpl<T extends Machine> implements MachineService<T> {

    @Override
    public List<T> getAll(Class<? extends Machine> type) {
        String classType = type.toString()
                .substring(type.toString().lastIndexOf(".") + 1);
        switch (classType) {
            case "Bulldozer":
                return (List<T>) new BulldozerProducer().get();
            case "Excavator":
                return (List<T>) new ExcavatorProducer().get();
            case "Truck":
                return (List<T>) new TruckProducer().get();
            default:
                return Collections.emptyList();
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
