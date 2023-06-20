package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class MachineServiceImpl implements MachineService<Machine> {
    private MachineProducer<Bulldozer> bulldozerMachineProducer;
    private MachineProducer<Truck> truckMachineProducer;
    private MachineProducer<Excavator> excavatorMachineProducer;

    public MachineServiceImpl() {
        this.truckMachineProducer = new TruckProducer();
        this.bulldozerMachineProducer = new BulldozerProducer();
        this.excavatorMachineProducer = new ExcavatorProducer();
    }

    @Override
    public List<Machine> getAll(Class<? extends Machine> type) {
        if (Objects.equals(type, Bulldozer.class)) {
            return new ArrayList<>(bulldozerMachineProducer.get());
        } else if (Objects.equals(type, Excavator.class)) {
            return new ArrayList<>(excavatorMachineProducer.get());
        } else if (Objects.equals(type, Truck.class)) {
            return new ArrayList<>(truckMachineProducer.get());
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
    public void startWorking(List<? extends Machine> machines) {
        for (int i = 0; i < machines.size(); i++) {
            machines.get(i).doWork();
        }
    }
}
