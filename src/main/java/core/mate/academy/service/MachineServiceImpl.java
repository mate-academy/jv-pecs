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
    private TruckProducer truck;
    private BulldozerProducer bulldozer;
    private ExcavatorProducer excavator;

    public MachineServiceImpl() {
        this.truck = new TruckProducer();
        this.excavator = new ExcavatorProducer();
        this.bulldozer = new BulldozerProducer();
    }

    @Override
    public List<Machine> getAll(Class<? extends Machine> type) {
        if (type == Truck.class) {
            return new ArrayList<>(truck.get());
        } else if (type == Excavator.class) {
            return new ArrayList<>(excavator.get());
        } else if (type == Bulldozer.class) {
            return new ArrayList<>(bulldozer.get());
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
        for (int i = 0; i < machines.size(); i++) {
            machines.get(i).doWork();
        }
    }
}
