package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class MachineServiceImpl<T extends Machine> implements MachineService<T> {
    private final MachineProducer<Excavator> excavatorProducer = new ExcavatorProducer();
    private final MachineProducer<Bulldozer> bulldozerProducer = new BulldozerProducer();
    private final MachineProducer<Truck> truckProducer = new TruckProducer();

    @Override
    public List<Machine> getAll(Class<? extends T> type) {
        MachineProducer<? extends Machine> machineProducer =
                getMachineProduser(type.getSimpleName());
        if (machineProducer == null) {
            return new ArrayList<>() {
            };
        }
        List<? extends Machine> machines = machineProducer.get();
        return new ArrayList<>(machines);
    }

    private MachineProducer<? extends Machine> getMachineProduser(String type) {
        switch (type) {
            case "Excavator": {
                return excavatorProducer;
            }
            case "Bulldozer": {
                return bulldozerProducer;
            }
            case "Truck": {
                return truckProducer;
            }
            default: {
                return null;
            }
        }
    }

    @Override
    public void fill(List<? super T> machines, T value) {
        for (int i = 0; i < machines.size(); i++) {
            machines.set(i, value);
        }
    }

    @Override
    public void startWorking(List<? extends T> machines) {
        for (Machine oneMachine : machines) {
            oneMachine.doWork();
        }
    }
}
