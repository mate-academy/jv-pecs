package core.mate.academy.service;

import core.mate.academy.model.Machine;
import java.util.ArrayList;
import java.util.List;

public class MachineServiceImpl implements MachineService<Machine> {
    @Override
    public List<Machine> getAll(Class<? extends Machine> type) {
        List<? extends Machine> machineList;
        switch (type.getSimpleName()) {
            case "Bulldozer":
                machineList = new BulldozerProducer().get();
                break;

            case "Excavator":
                machineList = new ExcavatorProducer().get();
                break;

            case "Truck":
                machineList = new TruckProducer().get();
                break;

            default:
                machineList = new ArrayList<>();
        }
        return new ArrayList<>(machineList);
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
