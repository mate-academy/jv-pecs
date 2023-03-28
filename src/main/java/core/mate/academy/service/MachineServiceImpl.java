package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class MachineServiceImpl implements MachineService<Machine> {

    private final MachineProducer<Bulldozer> bulldozerProducer;
    private final MachineProducer<Truck> truckProducer;
    private final MachineProducer<Excavator> excavatorProducer;

    public MachineServiceImpl() {
        this.bulldozerProducer = new BulldozerProducer();
        this.truckProducer = new TruckProducer();
        this.excavatorProducer = new ExcavatorProducer();
    }

    @Override
    public List<Machine> getAll(Class<? extends Machine> type) {
        List<? extends Machine> machines = new ArrayList<>();
        if (type == Bulldozer.class) {
            machines = bulldozerProducer.get();
        }
        if (type == Truck.class) {
            machines = truckProducer.get();
        }
        if (type == Excavator.class) {
            machines = excavatorProducer.get();
        }
        return new ArrayList<>(machines);
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
