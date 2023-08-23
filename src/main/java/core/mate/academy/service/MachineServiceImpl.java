package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

class MachineServiceImpl implements MachineService<Machine> {
    private Bulldozer bulldozerProducer = new Bulldozer();
    private Excavator excavatorProducer = new Excavator();
    private Truck truckProducer = new Truck();

    @Override
    public List<Machine> getAll(Class<? extends Machine> machineClass) {
        if (machineClass == Bulldozer.class) {
            return new ArrayList<>(bulldozerProducer.get());
        } else if (machineClass == Excavator.class) {
            return new ArrayList<>(excavatorProducer.get());
        } else if (machineClass == Truck.class) {
            return new ArrayList<>(truckProducer.get());
        }
        return new ArrayList<>();
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
